package decorator;

import java.util.ArrayList;

/**
 * A Vehicle
 * @author ctaks
 */
public abstract class Vehicle {
  protected ArrayList<String> lines;

  /**
   * Constructor
   * @param lines an arraylist of the vehicle
   */
  public Vehicle(ArrayList<String> lines) {
    this.lines = lines;
  }

  /**
   * puts the vehicle arraylist into a string to be returned
   * @return the vehicle's arraylist put into a single string
   */
  public String toString() {
    String theVehicle = "";
    for (String line : lines) {
      theVehicle += line+"\n";
    }
    return theVehicle;
  }
}
