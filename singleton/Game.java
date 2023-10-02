package singleton;

import java.util.Random;
import java.util.HashMap;
import java.util.ArrayList;

/**
 * The game class
 * @author ctaks
 */
public class Game {
  
  private static Game game;
  private Random rand;
  private Difficulty level;
  private HashMap<Difficulty, ArrayList<Anagram>> anagrams;
  private Anagram currentAnagram;
  private int score;

  /**
   * Constructs a game by putting the difficulty files into a hashmap
   */
  private Game() {
      this.anagrams = new HashMap<Difficulty, ArrayList<Anagram>>();
      this.anagrams.put(Difficulty.EASY, FileReader.getAnagrams(Difficulty.EASY));
      this.anagrams.put(Difficulty.MEDIUM, FileReader.getAnagrams(Difficulty.MEDIUM));
      this.anagrams.put(Difficulty.HARD, FileReader.getAnagrams(Difficulty.HARD));
      this.rand = new Random();
  }

  /**
   * Creates an instance of game if there already isn't one
   * @return the current game instance as type Game
   */
  public static Game getInstance() {
    if (game == null)
      game = new Game();
    return game;
  }

  /**
   * Gets the current question
   * @return the current question as a string
   */
  public String getQuestion() {
    if (game.getScore() <= 2) {
      this.level = Difficulty.EASY;
    }
    else if (game.getScore() <= 6) {
      this.level = Difficulty.MEDIUM;
    }
    else if (game.getScore() > 6) {
      this.level = Difficulty.HARD;
    }
    // removes anagram from list after it was used (stops reuse), also doesn't remove on upwards level change
    if (game.currentAnagram != null && game.getScore() != 3 && game.getScore() != 7)
      game.anagrams.get(game.level).remove(game.currentAnagram);
    // if the anagram list is depleted, it rebuilds it.
    if (game.anagrams.get(game.level).size() == 0)
      this.anagrams.put(this.level, FileReader.getAnagrams(this.level));
    
    int r = rand.nextInt(game.anagrams.get(game.level).size());
    this.currentAnagram = game.anagrams.get(game.level).get(r);
    return currentAnagram.getQuestion();
  }

  /**
   * Determines if the user's answer is correct or not and incriments the score accordingly
   * @param userAnswer the user's input to the question
   * @return boolean determining if the user's answer is correct or not
   */
  public boolean isCorrect(String userAnswer) {
    if(currentAnagram.isCorrect(userAnswer))
      this.score++;
    else
      this.score--;
    return currentAnagram.isCorrect(userAnswer);
  }

  /**
   * Gets the current score
   * @return returns the score as in integer
   */
  public int getScore() {
    return this.score;
  }

}
