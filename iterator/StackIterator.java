package iterator;

import java.util.Stack;
import java.util.Iterator;

/**
 * The StackIterator class. Iterates over a Stack of Strings by keeping its position in the stack.
 * @author ctaks
 */
public class StackIterator implements Iterator<String> {
  private Stack<String> items;
  private int position = -1;

  /**
   * Constructs a StackIterator
   * @param items the stack of strings to be given to the items variable
   */
  public StackIterator(Stack<String> items) {
    this.items = items;
  }

  /**
   * Increments position and returns the stack element at that position
   * @return returns the element at position
   */
  public String next() {
    position++;
    return this.items.elementAt(position);
  }

  /**
   * Determines if the stack has another element besides the current one
   * @return boolean determining if the stack is less than or equal to one
   */
  public boolean hasNext() {
    return position <= this.items.size() - 2;
  }
}
