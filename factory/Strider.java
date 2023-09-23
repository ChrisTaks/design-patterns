package factory;

/**
 * The Strider Class
 * @author ctaks
 */
public class Strider extends Bike {
  
  /**
   * Constructs a strider with appropriate assignments.
   */
  public Strider() {
    this.name = "Strider";
    this.price = 40.20; // // never used but might as well assign it
    this.numWheels = 2;
    this.hasPeddals = false;
    this.hasTrainingWheels = false;
  }
}
