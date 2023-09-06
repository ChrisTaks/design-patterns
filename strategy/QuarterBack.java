package strategy;

import java.util.Random;
/**
 * A QuarterBack football player
 * @author ctaks
 */
public class QuarterBack extends Player {
  /**
   * Creates a new Quarterback
   * @param firstName Quarterback's first name
   * @param lastName Quarterback's last name
   * @param offense boolean indicating if the QB is on offense or not
   */
  public QuarterBack(String firstName, String lastName, boolean offense) {
    super(firstName, lastName, offense);
  }
  /**
   * Setter for the QuarterBack's offense behavior. Randomly chooses between a run or pass.
   */
  @Override
  public void setOffensiveBehavior() {
    Random r = new Random();
    int runOrPass = r.nextInt(2);
    switch(runOrPass) {
      case 0: this.offenseBehavior = new RunBehavior();
              break;
      case 1: this.offenseBehavior = new PassBehavior();
              break;
      default: System.out.println("SetOffensiveBehavior ERROR");
              break;
    }
  }

  /**
   * Setter for the QuarterBack's defense behavior. Will always be null.
   */
  @Override
  public void setDefensiveBehavior() {
    this.defenseBehavior = null;
  }
}
