package PathFinder.model;

import com.jme3.scene.Geometry;

import java.util.ArrayList;
import java.util.List;

/**
 * ContainerPhysicalObject
 *
 * @author Evan Moseman (evan.moseman@corp.aol.com)
 * @version 1.0
 * @since 4/20/17
 */
public abstract class ContainerPhysicalObject
    extends PhysicalObject {

    private final List<PhysicalObject> storedObjects = new ArrayList<>();
    private final Integer itemCount;

    public ContainerPhysicalObject(final String name,
                                   final String description,
                                   final Float maxHealth,
                                   final Geometry geometry,
                                   final Boolean movable,
                                   final Integer itemCount) {
        super(name, description, maxHealth, geometry, movable);
        this.itemCount = itemCount;
    }

    public List<PhysicalObject> getStoredObjects() { return storedObjects; }

    public void addObject(PhysicalObject physicalObject) {
        storedObjects.add(physicalObject);
    }

    public void removeObject(PhysicalObject physicalObject) {
        storedObjects.remove(physicalObject);
    }

    public Integer getItemCount() { return itemCount; }
}
