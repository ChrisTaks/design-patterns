package strategy;

import java.util.Random;

/**
 * A Lineman football player
 * @author ctaks
 */
public class Lineman extends Player {
  /**
   * Creates a new Lineman
   * @param firstName Lineman's first name
   * @param lastName Lineman's last name
   * @param offense boolean indicating if the lineman is on offense or not.
   */
  public Lineman(String firstName, String lastName, boolean offense) {
    super(firstName, lastName, offense);
  }

  /**
   * Setter for the Lineman's defensive behavior. Will randomly choose between block, strip, or sack.
   */
  @Override
  public void setDefensiveBehavior() {
    Random r = new Random();
    int behavior = r.nextInt(3);
    switch(behavior) {
      case 0: this.defenseBehavior = new BlockBehavior();
              break;
      case 1: this.defenseBehavior = new StripBehavior();
              break;
      case 2: this.defenseBehavior = new SackBehavior();
              break;
      default: System.out.println("setDefensiveBehavior ERROR");
    }
  }

  /**
   * Setter for Lineman's defensive behavior. Will always choose "Oblock".
   */
  @Override
  public void setOffensiveBehavior() {
    this.offenseBehavior = new OBlockBehavior();
  }

}
