package decorator;

import java.util.ArrayList;

/**
 * Class for decorating the vehicle
 * @author ctaks
 */
public abstract class VehicleDecorator extends Vehicle{

  /**
   * Constructor
   * @param lines the ArrayList that contains the car
   */
  public VehicleDecorator(ArrayList<String> lines) {
    super(lines);
  }

  /**
   * Decorates the vehicle by combining the vehicle arraylist and the decoration arraylist 
   * @param decor the ArrayList that contains the text file decoration
   */
  protected void IntegrateDecor(ArrayList<String> decor) {
    for (int j = 0; j < lines.size(); j++) {
      for (int i = 0; i < decor.get(j).length(); i++) {
        if (decor.get(j).charAt(i) != ' ') {
          String decorLine = lines.get(j).substring(0,i)+decor.get(j).charAt(i)+lines.get(j).substring(i+1);
          lines.set(j, decorLine);
        }
      }
    }
  }
}
