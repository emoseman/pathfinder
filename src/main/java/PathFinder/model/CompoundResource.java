package PathFinder.model;

import java.util.List;

/**
 * CompoundResource
 *
 * @author Evan Moseman (evan.moseman@corp.aol.com)
 * @version 1.0
 * @since 4/20/17
 */
public abstract class CompoundResource
    extends Resource {
    private final List<Resource> components;

    protected CompoundResource(final String name,
                               final String description,
                               final Float weight,
                               final byte[] gameIcon,
                               final List<Resource> components) {
        super(name, description, weight, gameIcon);
        this.components = components;
    }
}
