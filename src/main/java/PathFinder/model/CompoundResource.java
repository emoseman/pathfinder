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
    private final List<CompoundComponent> components;

    protected CompoundResource(final String name,
                               final String description,
                               final Float weight,
                               final byte[] gameIcon,
                               final List<CompoundComponent> components) {
        super(name, description, weight, gameIcon);
        this.components = components;
    }

    public static class CompoundComponent {
        private Resource resource;
        private Integer  units;

        public CompoundComponent() {
        }

        public CompoundComponent(final Resource resource, final Integer units) {
            this.resource = resource;
            this.units = units;
        }

        public Resource getResource() {
            return resource;
        }

        public void setResource(final Resource resource) {
            this.resource = resource;
        }

        public Integer getUnits() {
            return units;
        }

        public void setUnits(final Integer units) {
            this.units = units;
        }
    }
}
