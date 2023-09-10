package observer;

/**
 * Interface used by the Golfer class
 */
public interface Subject {
  /**
   * All below methods defined in Golfer.
   */
  public void registerObserver(Observer observer);
  public void removeObserver(Observer observer);
  public void notifyObservers(int strokes, int par);
}
