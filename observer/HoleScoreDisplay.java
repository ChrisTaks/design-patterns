package observer;

/**
 * processes and displays the hole score
 */
public class HoleScoreDisplay implements Observer{
  private Subject golfer;
  private int strokes;
  private int par;

  /**
   * Constructor
   * @param golfer the object that holds the scores
   */
  public HoleScoreDisplay(Subject golfer) {
    this.golfer = golfer;
    golfer.registerObserver(this);
  }

  /**
   * replaces the current stroke and par with new data
   * @param strokes integer of the stroke the user puts in
   * @param par integer of the preset par
   */
  @Override
  public void update(int strokes, int par) {
    this.strokes = strokes;
    this.par = par;
  }

  /**
   * returns a string of the current Hole's data.
   */
  @Override
  public String toString() {
    int statResults = strokes - par;
    String stats = "Current Hole stats: Par ("+this.par+") Strokes ("+this.strokes+"), ";
    String end = "";
    if(statResults > 0)
      end = stats.concat(statResults+" over par");
      else if(statResults == 0)
      end = stats.concat("making par");
      else if (statResults < 0)
      end = stats.concat(statResults+" under par");

    return end;
  }
  
}
