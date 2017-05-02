package PathFinder;

import com.jme3.app.SimpleApplication;
import com.jme3.input.CameraInput;
import com.jme3.input.KeyInput;
import com.jme3.input.controls.ActionListener;
import com.jme3.input.controls.KeyTrigger;
import com.jme3.material.Material;
import com.jme3.terrain.geomipmap.TerrainLodControl;
import com.jme3.terrain.geomipmap.TerrainQuad;
import com.jme3.terrain.heightmap.HillHeightMap;
import com.jme3.texture.Texture;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.SecureRandom;

/**
 * PathFinder
 *
 * @author Evan Moseman (evan.moseman@corp.aol.com)
 * @version 1.0
 * @since 4/14/17
 */
public class PathFinder
    extends SimpleApplication {
    private static final Logger log = LoggerFactory.getLogger(PathFinder.class);
    private TerrainQuad terrain;
    Material mat_terrain;
    public static final String SPRINT_MAPPING = "SPRINT";

    public PathFinder() {
    }

    @Override
    public void simpleInitApp() {
        /* 1. Create terrain material and load four textures into it. */
        mat_terrain = new Material(assetManager, "Common/MatDefs/Terrain/Terrain.j3md");

        /* 1.1) Add ALPHA map (for red-blue-green coded splat textures) */
        mat_terrain.setTexture("Alpha", assetManager.loadTexture("Textures/Terrain/splat/alphamap.png"));

        /* 1.2) Add GRASS texture into the red layer (Tex1). */
        Texture grass = assetManager.loadTexture("Textures/Terrain/splat/grass.jpg");
        grass.setWrap(Texture.WrapMode.Repeat);
        mat_terrain.setTexture("Tex1", grass);
        mat_terrain.setFloat("Tex1Scale", 64f);

        /* 1.3) Add DIRT texture into the green layer (Tex2) */
        Texture dirt = assetManager.loadTexture("Textures/Terrain/splat/dirt.jpg");
        dirt.setWrap(Texture.WrapMode.Repeat);
        mat_terrain.setTexture("Tex2", dirt);
        mat_terrain.setFloat("Tex2Scale", 32f);

        /* 1.4) Add ROAD texture into the blue layer (Tex3) */
        Texture rock = assetManager.loadTexture("Textures/Terrain/splat/road.jpg");
        rock.setWrap(Texture.WrapMode.Repeat);
        mat_terrain.setTexture("Tex3", rock);
        mat_terrain.setFloat("Tex3Scale", 128f);

        /* 2. Create the height map */
//        AbstractHeightMap heightmap      = null;
//        Texture           heightMapImage = assetManager.loadTexture("Textures/Terrain/splat/mountains512.png");
//        heightmap = new ImageBasedHeightMap(heightMapImage.getImage());
        HillHeightMap heightmap = null;
        HillHeightMap.NORMALIZE_RANGE = 100; // optional
        SecureRandom secureRandom = new SecureRandom();
        try {
            heightmap = new HillHeightMap(1513, 2000, 50, 100, secureRandom.nextLong()); // byte 3 is a random seed
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        heightmap.load();

        /* 3. We have prepared material and heightmap.
          Now we create the actual terrain:
          3.1) Create a TerrainQuad and name it "my terrain".
          3.2) A good value for terrain tiles is 64x64 -- so we supply 64+1=65.
          3.3) We prepared a heightmap of size 512x512 -- so we supply 512+1=513.
          3.4) As LOD step scale we supply Vector3f(1,1,1).
          3.5) We supply the prepared heightmap itself.
         */
        int patchSize = 65;
        terrain = new TerrainQuad("my terrain", patchSize, 513, heightmap.getHeightMap());

        /* 4. We give the terrain its material, position & scale it, and attach it. */
        terrain.setMaterial(mat_terrain);
        terrain.setLocalTranslation(0, -100, 0);
        terrain.setLocalScale(2f, 1f, 2f);
        rootNode.attachChild(terrain);

        /* 5. The LOD (level of detail) depends on were the camera is: */
        TerrainLodControl control = new TerrainLodControl(terrain, getCamera());
        terrain.addControl(control);

        final float baseMoveSpeed = flyCam.getMoveSpeed() * 10;
        log.info("baseMoveSpeed = {}", baseMoveSpeed);
        flyCam.setMoveSpeed(baseMoveSpeed);
        flyCam.onAction(CameraInput.FLYCAM_INVERTY, false, 0);

        inputManager.addMapping(SPRINT_MAPPING, new KeyTrigger(KeyInput.KEY_LSHIFT));
        inputManager.addListener((ActionListener) (name, isPressed, tpf) -> {
            log.info("inputManager listener - name:{} isPressed:{} tpf:{}", name, isPressed, tpf);
            if (name.equals(SPRINT_MAPPING)) {
                if (isPressed) {
                    flyCam.setMoveSpeed(baseMoveSpeed * 5);
                }
                else {
                    flyCam.setMoveSpeed(baseMoveSpeed);
                }
                log.info("flyCam.getMoveSpeed() = {}", flyCam.getMoveSpeed());
            }
        }, SPRINT_MAPPING);
    }

    public static void main(String[] args) {
        PathFinder pathFinder = new PathFinder();
        pathFinder.start();
    }
}
