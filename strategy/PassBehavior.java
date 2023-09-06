package strategy;

import java.util.Random;
/**
 * Chooses what happens when a player passes on offense
 * @author ctaks
 */
public class PassBehavior implements OffenseBehavior {

  Random r = new Random();
  /**
   * randomly chooses an action that happens when a player passes on offense
   * @return a string that indicates the randomly chosen option upon passing
   */
  public String play() {
    int action = r.nextInt(5);
    String passAction = "startup ERROR";
    switch(action) {
      case 0: passAction = "throws a slant route";
              break;
      case 1: passAction = "throws an out route";
              break;
      case 2: passAction = "throws a seem route";
              break;
      case 3: passAction = "throws a screen pass";
              break;
      case 4: passAction = "throws a hail mary";
              break;
      default: passAction = "throws an ERROR";
              break;
    }
    return passAction;
  }
  
}
