import java.util.EmptyStackException;

/**
 * The generic Stack class represents a last-in-first-out (LIFO) stack of
 * objects. The usual push and pop operations are provided, as well as a method
 * to peek at the top item on the stack, a method to test for whether the stack
 * is empty. When a stack is first created, it contains no items.
 *   
 * @author Rick Mercer
 * @author Jeremy Mowery
 */
public interface Stack<E> {
     
  /**
   * Add a new element at the "top" of the stack.
   * 
   * @param newTop
   *          The element that will be position at the "top" of this stack
   */
  public void push(E newTop);

  /**
   * Find out if this stack has no elements
   *
   * @return true if there are zero elements in this Stack
   */
  public boolean isEmpty();

  /**
   * Get a reference to the object at the top of the stack
   * 
   * @return The element at the top of the stack
   * @throws EmptyStackException
   *           if this stack is empty.
   */
  public E getTop() throws EmptyStackException;

  /**
   * Remove and return the element at the "top" of the stack.
   * 
   * @return The element at the top of the stack
   * @throws EmptyStackException
   *           if this stack is empty.
   */
  public E pop() throws EmptyStackException;

}
