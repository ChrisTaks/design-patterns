package decorator;

/**
 * slap some new paint on the vehicle
 * @author ctaks
 */
public class Paint extends VehicleDecorator{
  
  /**
   * Constructor
   * @param vehicle contains the ArrayList that holds the vehicle
   * @param color user inputted color that the car will change to
   */
  public Paint(Vehicle vehicle, String color) {
    super(vehicle.lines);
    String colorVal;
    color.toLowerCase();
    switch (color) {
      case "red": colorVal = "\u001B[31m";
      break;
      case "green": colorVal = "\u001B[32m";
      break;
      case "yellow": colorVal = "\u001B[33m";
      break;
      case "blue": colorVal = "\u001B[34m";
      break;
      case "purple": colorVal = "\u001B[35m";
      break;
      case "cyan": colorVal = "\u001B[36m";
      break;
      case "none": colorVal = "\u001B[0m";
      break;
      default: colorVal = "oopsie";
      break;
    }
    // setting first line to the indicated color
    String addcolor = colorVal+lines.get(0);
    lines.set(0, addcolor);

    //setting last line to black
    String backToBlack = lines.get(lines.size()-1)+"\u001B[0m";
    lines.set(lines.size()-1, backToBlack);
  }
}
