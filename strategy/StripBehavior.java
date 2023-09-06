package strategy;
/**
 * Chooses what happens when a player strips on defense
 * @author ctaks
 */
public class StripBehavior implements DefenseBehavior{
  /**
   * returns the action that happens when a player strips on defense
   * @return A string indicating the player has stripped the ball
   */
  public String play() {
    return "Strip a ball from runners hands";
  }
}
