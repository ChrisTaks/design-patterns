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
      anagrams = new HashMap();
      anagrams.put(Difficulty.EASY, FileReader.getAnagrams(Difficulty.EASY));
      anagrams.put(Difficulty.MEDIUM, FileReader.getAnagrams(Difficulty.MEDIUM));
      anagrams.put(Difficulty.HARD, FileReader.getAnagrams(Difficulty.HARD));
      rand = new Random();
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
      game.level = Difficulty.EASY;
    }
    else if (game.getScore() <= 5) {
      game.level = Difficulty.MEDIUM;
    }
    else if (game.getScore() > 5) {
      game.level = Difficulty.HARD;
    }
    int r = rand.nextInt(game.anagrams.get(game.level).size());
    // stops the same random int from being chosen two times in a row
    boolean isSame = true;
    while(isSame) {
      if (game.anagrams.get(game.level).get(r) == game.currentAnagram)
        r = rand.nextInt(game.anagrams.get(game.level).size());
      else
        isSame = false;
    }

    game.currentAnagram = game.anagrams.get(game.level).get(r);
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
