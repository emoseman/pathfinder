package PathFinder.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Player
 *
 * @author Evan Moseman (evan.moseman@corp.aol.com)
 * @version 1.0
 * @since 4/14/17
 */
public class Player {
    private static final Logger log = LoggerFactory.getLogger(Player.class);

    private String name;
    private String uuid;
    private Float health;
    private Integer level;


    public Player() {
    }
}
