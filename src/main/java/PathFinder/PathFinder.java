package PathFinder;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

    public PathFinder() {
    }

    @Override
    public void simpleInitApp() {
        Box      b        = new Box(1, 1, 1);
        Geometry geometry = new Geometry("Box", b);
        Material mat      = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat.setColor("Color", ColorRGBA.Blue);
        geometry.setMaterial(mat);
        rootNode.attachChild(geometry);
    }

    public static void main(String[] args) {
        PathFinder pathFinder = new PathFinder();
        pathFinder.start();
    }
}
