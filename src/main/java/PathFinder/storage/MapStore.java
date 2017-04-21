package PathFinder.storage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * MapStore
 *
 * @author Evan Moseman (evan.moseman@corp.aol.com)
 * @version 1.0
 * @since 4/14/17
 */
public class MapStore
    implements Store {
    private static final Logger log = LoggerFactory.getLogger(MapStore.class);

    public MapStore() {
    }

    @Override
    public void initialize() {
        throw new RuntimeException("MapStore.initialize not yet implemented!");
    }

    @Override
    public void verify() {
        throw new RuntimeException("MapStore.verify not yet implemented!");
    }

    @Override
    public Object load() {
        throw new RuntimeException("MapStore.load not yet implemented!");
    }

    @Override
    public void store() {
        throw new RuntimeException("MapStore.store not yet implemented!");
    }
}
