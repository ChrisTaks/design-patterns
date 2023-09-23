package factory;

/**
 * The Tricycle Class
 * @author ctaks
 */
public class Tricycle extends Bike {
  
  /**
   * Constructs a tricycle with appropriate assignments.
   */
  public Tricycle() {
    this.name = "Tricycle";
    this.price = 69.99; // never used but might as well assign it
    this.numWheels = 3;
    this.hasPeddals = true;
    this.hasTrainingWheels = false;
  }
}
