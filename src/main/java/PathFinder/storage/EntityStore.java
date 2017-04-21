package PathFinder.storage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * EntityStore
 *
 * @author Evan Moseman (evan.moseman@corp.aol.com)
 * @version 1.0
 * @since 4/14/17
 */
public class EntityStore implements Store {
    private static final Logger log = LoggerFactory.getLogger(EntityStore.class);

    public EntityStore() {
    }

    @Override
    public void initialize() {
        throw new RuntimeException("EntityStore.initialize not yet implemented!");
    }

    @Override
    public void verify() {
        throw new RuntimeException("EntityStore.verify not yet implemented!");
    }

    @Override
    public Object load() {
        throw new RuntimeException("EntityStore.load not yet implemented!");
    }

    @Override
    public void store() {
        throw new RuntimeException("EntityStore.store not yet implemented!");
    }
}
