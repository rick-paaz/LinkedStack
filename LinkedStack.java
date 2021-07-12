import java.util.EmptyStackException;

/**
 * The generic Stack class represents a last-in-first-out (LIFO) stack of
 * objects. The usual push and pop operations are provided, as well as a method
 * to peek at the top item on the stack, a method to test for whether the stack
 * is empty. When a stack is first created, it contains no items.
 * 
 * @author Rick Mercer
 * @author YOUR NAME
 */

public class LinkedStack<E> implements Stack<E> {

  // Allow elements to be stored in a linked structure
  private class Node {
    private E data; // Reference to the element
    private Node next; // Reference to next node

    public Node(E element, Node nextRef) {
      data = element;
      next = nextRef;
    }
  } // end inner class

  // Store a reference to the Node on the top of this Stack
  private Node top;

  // Constructor
  public LinkedStack() {
    top = null;
  }

  /**
   * Add a new element at the "top" of the stack.
   * 
   * @param newTop
   *          The element that will be position at the "top" of this stack
   */
  public void push(E newElement) {
    // TODO: Complete this method
  }

  /**
   * Find out if this stack has no elements
   *
   * @return true if there are zero elements in this Stack
   */
  public boolean isEmpty() {
    // TODO: Complete this method
    return !false;
  }

  /**
   * Get a reference to the object at the top of the stack
   * 
   * @return The element at the top of the stack
   * @throws EmptyStackException
   *           if this stack is empty.
   */   
  public E getTop() throws EmptyStackException {
    // TODO: Complete this method
    return null;
  }
 
  /**
   * Remove and return the element at the "top" of the stack.
   * 
   * @return The element at the top of the stack
   * @throws EmptyStackException
   *           if this stack is empty.
   */  
  public E pop() throws EmptyStackException {
    // TODO: Complete this method
    return null;
  }

}
