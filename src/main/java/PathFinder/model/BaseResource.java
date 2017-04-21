package PathFinder.model;

/**
 * BaseResource
 *
 * @author Evan Moseman (evan.moseman@corp.aol.com)
 * @version 1.0
 * @since 4/20/17
 */
public abstract class BaseResource
    extends Resource {

    protected BaseResource(final String name,
                           final String description,
                           final Float weight,
                           final byte[] gameIcon) {
        super(name, description, weight, gameIcon);
    }
}
