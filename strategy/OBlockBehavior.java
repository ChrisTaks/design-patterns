package strategy;
/**
 * Determines what happens when a player Oblocks on offense
 * @author ctaks
 */
public class OBlockBehavior implements OffenseBehavior {
  /**
   * Returns the action that happens when a player oblocks on offense
   * @return A string indicating the player has blocked defenders
   */
  public String play() {
    return "Block Defenders";
  }
}
