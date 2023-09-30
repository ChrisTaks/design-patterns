package singleton;

import java.util.ArrayList;

/**
 * The anagram class. Holds the question and the list of possible answers
 * @author ctaks
 */
public class Anagram {
  
  private String question;
  private ArrayList<String> answers;

  /**
   * Constructs an anagram
   * @param question the letters that the player turns into an anagram
   * @param answers possible anagrams of the question
   */
  public Anagram(String question, ArrayList<String> answers) {
    this.question = question;
    this.answers = answers;
  }

  /**
   * Gets the current question
   * @return the current question as a string
   */
  public String getQuestion() {
    return this.question;
  }

  /**
   * Checks the user's anagram with the list of correct anagrams
   * @param userAnswer the anagram answer to the question
   * @return boolean determining the if the user's answer is true or false
   */
  public boolean isCorrect(String userAnswer) {
    for (String ans : answers) {
      if (userAnswer.equalsIgnoreCase(ans))
        return true;
    }
    return false;
  }


}
