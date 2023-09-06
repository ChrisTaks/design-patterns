package strategy;

import java.util.Random;
/**
 * Determines what happens when a player blocks on defense
 * @author ctaks
 */
public class BlockBehavior implements DefenseBehavior {

  Random r = new Random();
  /**
   * Randomly chooses an action that happens when blocking on defense
   * @return A string indicating the randomly selected option upon blocking
   */
  public String play() {
    int action = r.nextInt(4);
    String blockAction = "startup ERROR";
    switch (action) {
      case 0: blockAction = "block a kick";
              break;
      case 1: blockAction = "block a punt";
              break;
      case 2: blockAction = "block a pass";
              break;
      case 3: blockAction = "block a catch";
              break;
      default: blockAction = "block an ERROR";
              break;
    }
    return blockAction;
  }
}