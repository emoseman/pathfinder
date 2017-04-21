package PathFinder.model;

import com.jme3.scene.Geometry;

/**
 * PhysicalObject
 *
 * @author Evan Moseman (evan.moseman@corp.aol.com)
 * @version 1.0
 * @since 4/20/17
 */
public abstract class PhysicalObject {
    private final String   name;
    private final String   description;
    private final Float    maxHealth;
    private       Float    currentHealth;
    private final Geometry geometry;
    private final Boolean  movable;

    public PhysicalObject(final String name,
                          final String description,
                          final Float maxHealth,
                          final Geometry geometry,
                          final Boolean movable) {
        this.name = name;
        this.description = description;
        this.maxHealth = maxHealth;
        this.geometry = geometry;
        currentHealth = maxHealth;
        this.movable = movable;
    }

    public String getName() { return name; }

    public String getDescription() { return description; }

    public Float getMaxHealth() { return maxHealth; }

    public Float getCurrentHealth() { return currentHealth; }

    public void setCurrentHealth(final Float currentHealth) { this.currentHealth = currentHealth; }

    public Geometry getGeometry() { return geometry; }

    public Boolean getMovable() { return movable; }
}
