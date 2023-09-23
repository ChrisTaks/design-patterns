package factory;

/**
 * The Bike Store Class
 * @author ctaks
 */
public class BikeStore {

  /**
   * 
   * @param type
   * @return
   */
  public Bike createBike(String type) {
    // the type of bike is passed into the method, and from there we build the bike
    if (type.equalsIgnoreCase("tricycle")) {
      Bike bike = new Tricycle();
      return bike;
    } else if (type.equalsIgnoreCase("strider")) {
      Bike bike = new Strider();
      return bike;
    } else {
      Bike bike = new KidsBike();
      return bike;
    }
    
  }
}
