package factory;

/**
 * The Kids Bike Class
 * @author ctaks
 */
public class KidsBike extends Bike {
  
  /**
   * Constructs a kids bike with appropriate assignments.
   */
  public KidsBike() {
    this.name = "Kids Bike";
    this.price = 30.50; // never used but might as well assign it
    this.numWheels = 2;
    this.hasPeddals = true;
    this.hasTrainingWheels = true;
  }
}
