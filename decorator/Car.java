package decorator;

// import java.util.ArrayList;

/**
 * A car
 * @author ctaks
 */
public class Car extends Vehicle{

  /**
   * constructor
   */
  public Car() {
    super(FileReader.getLines("decorator/txt/car.txt"));

  }


  
}
