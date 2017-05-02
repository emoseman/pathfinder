package PathFinder.resources;

import PathFinder.model.CompoundResource;

import java.util.Arrays;

/**
 * BatteryAcid
 *
 * @author Evan Moseman (evan.moseman@corp.aol.com)
 * @version 1.0
 * @since 4/20/17
 */
public class BatteryAcid
    extends CompoundResource {
    public BatteryAcid() {
        super("Battery Acid",
              "A jug of very powerful acid, it says on the lable 'harmful if swallowed'.",
              0.0F,
              new byte[0],
              Arrays.asList(new Water(), new SulphuricAcid()));
    }
}
