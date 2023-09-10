package observer;

import java.util.ArrayList;

/**
 * A golf player
 */
public class Golfer implements Subject {
  private ArrayList<Observer> observers;
  private String name;

  /**
   * Constructor
   * @param name the golfer's name. Will be entered by the user.
   */
  public Golfer(String name) {
    this.name = name;
    observers = new ArrayList<Observer>();
  }

  /**
   * adds an observer to the observer list.
   * @param observer the observer that will be added
   */
  @Override
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  /**
   * removes an observer from the observer list.
   * @param observer the observer that will be removed.
   */
  @Override
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  /**
   * updates every observer in the array with the new data
   * @param strokes strokes to be updated
   * @param par par to be updated
   */
  @Override
  public void notifyObservers(int strokes, int par) {
    for(Observer observer : observers) {
        observer.update(strokes, par);
    }
  }

  /**
   * sends the paramater data to the observer.
   * @param strokes strokes to be updated
   * @param par par to be updated
   */
  public void enterScore(int strokes, int par) {
    notifyObservers(strokes, par);
  }

  /**
   * A simple method to get the user's name
   * @return returns a string of the user's name
   */
  public String getName() {
    return name;
  }
}
