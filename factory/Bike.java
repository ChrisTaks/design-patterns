package factory;

/**
 * The Bike class
 * @author ctaks
 */
public abstract class Bike {
  protected String name;
  protected double price;
  protected int numWheels;
  protected boolean hasPeddals;
  protected boolean hasTrainingWheels;

  /**
   * Assembling the entire bike.
   * @return string with all the other string methods, claiming a bike is being assembled
   */
  public String assembleBike() {
    return "Creating a "+name+"\n"+createFrame()+addWheels()+addPedals();
  }

  /**
   * Creates the frame of the bike.
   * @return string claiming the frame is being assembled
   */
  private String createFrame() {
    return "- Assembling "+name+" frame\n";
  }

  /**
   * Adds wheels on the bike, as well as training wheels if hasTrainingWheels is true.
   * @return string stating the number of wheels added and possibly training wheels.
   */
  private String addWheels() {
    if(hasTrainingWheels)
      return "- Adding "+numWheels+" wheels(s)\n- Adding training wheels\n";
    else
      return "- Adding "+numWheels+" wheel(s)\n";
  }

  /**
   * Adds pedals on the bike if hasPeddals is true.
   * @return string claiming the pedals have been added
   */
  private String addPedals() {
    if(hasPeddals)
      return "- Adding pedals\n";
    else
      return "";
  }

  /**
   * Gets the price of the bike
   * @return the bike's price
   */
  public double getPrice() {
    return this.price;
  }
}
