package strategy;

import java.util.Random;
/**
 * Chooses what happens when a player receives on offense
 * @author ctaks
 */
public class ReceiveBehavior implements OffenseBehavior{
/**
 * randomly chooses an action that happens when a player receives on offense
 * @return A string that indicates the randomly chosen option upon receiving
 */
  Random r = new Random();
  public String play() {
    int action = r.nextInt(5);
    String receiveAction = "receiveAction ERROR";
    switch (action) {
      case 0: receiveAction = "runs a slant route";
              break;
      case 1: receiveAction = "runs an out route";
              break;
      case 2: receiveAction = "runs a seem route";
              break;
      case 3: receiveAction = "runs a screen pass";
              break;
      case 4: receiveAction = "runs a hail mary";
              break;
      default: receiveAction = "receive an ERROR";
    }
    return receiveAction;
  }
  
}
