package observer;

/**
 * proccesses and displays the round score
 */
public class RoundScoreDisplay implements Observer{
  private Subject golfer;
  private int strokesTotal;
  private int parTotal;

  /**
   * Constructor
   * @param golfer the object that holds the scores
   */
  public RoundScoreDisplay(Subject golfer) {
    this.golfer = golfer;
    golfer.registerObserver(this);
  }

  /**
   * updates the new total strokes/par with the current hole's data
   * @param strokes integer of the strokes the user puts in
   * @param par integer of the preset par
   */
  @Override
  public void update(int strokes, int par) {
    strokesTotal += strokes;
    parTotal += par;
  }

  /**
   * returns a string of the current round's data.
   */
  @Override
  public String toString() {
    int roundResults = strokesTotal - parTotal;
    String beginning = "Overall stats: Par ("+parTotal+") Strokes ("+strokesTotal+"), ";
    String end = "";
    if(roundResults > 0)
      end = beginning.concat(roundResults+" over par");
    else if(roundResults == 0)
      end = beginning.concat("making par");
    else if(roundResults < 0)
      end = beginning.concat(roundResults+" under par");

    return end;
  }
}
