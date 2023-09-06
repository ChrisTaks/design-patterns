package strategy;
/**
 * A Receiver football player
 * @author ctaks
 */
public class Receiver extends Player {
  /**
   * Creates a new Receiver
   * @param firstName Receiver's first name
   * @param lastName Receiver's last name
   * @param offense boolean indicating if the receiver is on offense or not
   */
  public Receiver(String firstName, String lastName, boolean offense) {
    super (firstName, lastName, offense);
  }

  /**
   * Setter for the Receiver's offense behavior. Will always choose to receive.
   */
  @Override
  public void setOffensiveBehavior() {
    this.offenseBehavior = new ReceiveBehavior();
  }

  /**
   * Setter for Receiver's defensive behavior. Will always be null.
   */
  @Override
  public void setDefensiveBehavior() {
    this.defenseBehavior = null;
  }
}
