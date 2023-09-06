package strategy;
/**
 * Chooses what happens when a player sacks on defense
 * @author ctaks
 */
public class SackBehavior implements DefenseBehavior {
  /**
   * Returns the action that happens when a player sacks on defense
   * @return A string indicating the player has sacked the quarterback
   */
  public String play() {
    return "Sack the quarterback";
  }
}
