package decorator;

/**
 * Pimp out the rims on the vehicle
 * @author ctaks
 */
public class Rims extends VehicleDecorator{
  
  /**
   * Constructor
   * @param vehicle
   */
  public Rims(Vehicle vehicle) {
    super(vehicle.lines);
    IntegrateDecor(FileReader.getLines("decorator/txt/rims.txt"));
  }
}
