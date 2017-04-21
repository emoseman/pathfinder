package PathFinder.model;

/**
 * Material
 *
 * @author Evan Moseman (evan.moseman@corp.aol.com)
 * @version 1.0
 * @since 4/20/17
 */
public abstract class Resource {

    private final String name;
    private final String description;
    private final Float  weight;
    private final byte[] gameIcon;

    protected Resource(final String name, final String description, final Float weight, final byte[] gameIcon) {
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.gameIcon = gameIcon;
    }

    public String getName() { return name; }

    public String getDescription() { return description; }

    public Float getWeight() { return weight; }

    public byte[] getGameIcon() { return gameIcon; }
}
