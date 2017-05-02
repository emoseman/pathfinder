package PathFinder.resources;

import PathFinder.model.CompoundResource;

import java.util.Arrays;

/**
 * Lithium
 *
 * @author Evan Moseman (evan.moseman@corp.aol.com)
 * @version 1.0
 * @since 4/20/17
 */
public class Steel
    extends CompoundResource {

    public Steel() {
        super("Steel",
              "*Insert steel pun here*",
              15.0F,
              new byte[0],
              Arrays.asList(new CompoundComponent(new Carbon(), 1),
                            new CompoundComponent(new Iron(), 10)));
    }
}
