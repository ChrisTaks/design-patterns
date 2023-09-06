package strategy;

/**
 * A football player
 * @author ctaks
 */
public abstract class Player {
  private String firstName;
  private String lastName;
  private boolean offense;
  protected DefenseBehavior defenseBehavior;
  protected OffenseBehavior offenseBehavior;

  public Player(String firstName, String lastName, boolean offense) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.offense = offense;
  }

  public abstract void setDefensiveBehavior();
  public abstract void setOffensiveBehavior();

  /**
   * Decides what play the player is going to make
   * @return a string describing the play that the player makes
   */
  public String play() {
    String behavior = "play fail"; 
    if(offense) {
      this.setOffensiveBehavior();
      if (offenseBehavior == null)
        return "not playing";
      else
      behavior = offenseBehavior.play();
    }
    if(!offense) {
      this.setDefensiveBehavior();
      if(defenseBehavior == null)
        return "not playing";
      else
      behavior = defenseBehavior.play();
    }
    return behavior;
  }

  /**
   * flips the truth value for offense
   */
  public void turnover() {
    offense = !offense;
  }

  /**
   * Creates a string of the player's first and last name
   * @return A string of the player's first and last name
   */
  public String toString() {
    return this.firstName + " " + this.lastName;
  }
}
