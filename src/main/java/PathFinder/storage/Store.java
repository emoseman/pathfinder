package PathFinder.storage;

/**
 * Store
 *
 * @author Evan Moseman (evan.moseman@corp.aol.com)
 * @version 1.0
 * @since 4/14/17
 */
public interface Store<V> {
    /**
     * Initialize a data store.
     */
    void initialize();

    /**
     * Verify the integrity of the data store.
     */
    void verify();

    /**
     * Load the data store from local storage
     * @return
     */
    public V load();

    /**
     * Save the data to local storage
     */
    public void store();
}
