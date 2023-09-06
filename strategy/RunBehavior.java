package strategy;

import java.util.Random;
/**
 * Chooses what happens when a player runs on offense
 * @author ctaks
 */
public class RunBehavior implements OffenseBehavior {

  Random r = new Random();
  /**
   * Randomly chooses a different action that happens when the player runs
   * @return A string defining what happens when the player runs
   */
  public String play() {
    int action = r.nextInt(4);
    String RunAction;
    switch(action) {
      case 0: RunAction = "runs a drive (up the gut)";
              break;
      case 1: RunAction = "runs a draw";
              break;
      case 2: RunAction = "runs a pitch";
              break;
      case 3: RunAction = "runs a reverse";
              break;
      default: RunAction = "runs an ERROR " + action;
              break;
    }
    return RunAction;
  }
}
