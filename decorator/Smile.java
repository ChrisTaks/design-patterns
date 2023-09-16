package decorator;

/**
 * Let's put a smile on that vehicle's face
 * @author ctaks
 */
public class Smile extends VehicleDecorator{
  
  /**
   * Constructor
   * @param vehicle contains the ArrayList that holds the vehicle
   */
  public Smile(Vehicle vehicle) {
    super(vehicle.lines);
    IntegrateDecor(FileReader.getLines("decorator/txt/smile.txt"));
  }
}
