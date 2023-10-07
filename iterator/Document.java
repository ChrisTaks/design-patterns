package iterator;

import java.util.Stack;

/**
 * The Document class. Holds the document title as well as Stacks of Strings of the undo and redo lists.
 * @author ctaks
 */
public class Document {
  
  private String title;
  private Stack<String> undoStack;
  private Stack<String> redoStack;

  /**
   * Constructs a document. Adds a title and also constructs undoStack and redoStack.
   * @param title A title for the document.
   */
  public Document(String title) {
    this.title = title;
    this.undoStack = new Stack<String>();
    this.redoStack = new Stack<String>();
  }

  /**
   * Makes a change to the doccument by pushing the change onto the undo stack.
   * @param change A change to be made to the document.
   * @return A string indicating that it's making a change, along with an undoStack peek.
   */
  public String makeChange(String change) {
    if (this.title != null)  // adding this so title is used. I hate the yellow warnings.
      undoStack.push(change);
    return "Making Change: "+undoStack.peek();
  }

  /**
   * Undoes a change. Pushes the top of undoStack onto the redoStack and then pops undoStack.
   * @return The most recent addition to redoStack.
   */
  public String undoChange() {
    redoStack.push(undoStack.peek());
    undoStack.pop();
    return redoStack.peek();
  }

  /**
   * Checks to see if an undo can be made.
   * @return A boolean checking if the undoStack is empty or not.
   */
  public boolean canUndo() {
    return !undoStack.isEmpty();
  }

  /**
   * Redo a change. Pushes the top of redoStack onto the undoStack and then pops redoStack.
   * @return The most recent addition to undoStack.
   */
  public String redoChange() {
    undoStack.push(redoStack.peek());
    redoStack.pop();
    return undoStack.peek();
  }

  /**
   * Checks to see if a redo can be made.
   * @return A boolean checking if the redoStack is empty or not.
   */
  public boolean canRedo() {
    return !redoStack.isEmpty();
  }

  /**
   * Creates and returns a StackIterator with the current undoStack.
   * @return A StackIterator containing the current undoStack.
   */
  public StackIterator getUndoIterator() {
      StackIterator undo = new StackIterator(undoStack);
      return undo;
  }

  /**
   * Creates and returns a StackIterator with the current redoStack.
   * @return A StackIterator containing the current redoStack.
   */
  public StackIterator getRedoIterator() {
    StackIterator redo = new StackIterator(redoStack);
    return redo;
  }
}
