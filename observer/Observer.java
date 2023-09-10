package observer;
/**
 * Interface of the Observer
 * @author ctaks
 */
public interface Observer {
  /**
   * Defined in HoleScoreDisplay and RounScoreDisplay
   * @param strokes
   * @param par
   */
  public void update(int strokes, int par);

  /**
   * Defined in HoleScoreDisplay and RoundScoreDisplay
   */
  public String toString();
}
