import static org.junit.Assert.*;

import java.util.EmptyStackException;

import org.junit.Test; 

/**
 * A unit test for class LinkedList<E>
 * 
 * @author Rick Mercer
 */
public class LinkedStackTest {

  @Test
  public void testIsEmptyAndPush() {
    LinkedStack<Integer> aStack = new LinkedStack<Integer>();
    assertTrue(aStack.isEmpty());
    aStack.push(1);
    assertFalse(aStack.isEmpty());
    aStack.push(2);
    assertFalse(aStack.isEmpty());
  }

  @Test
  public void testIsGetTop() {
    LinkedStack<String> aStack = new LinkedStack<String>();
    aStack.push("first");
    assertEquals("first", aStack.getTop());
    aStack.push("second");
    assertEquals("second", aStack.getTop());
    aStack.push("third");
    assertEquals("third", aStack.getTop());

  }

  @Test
  public void testIsPop() {
    LinkedStack<String> aStack = new LinkedStack<String>();
    aStack.push("first");
    aStack.push("second");
    aStack.push("third");
    assertEquals("third", aStack.pop());
    assertEquals("second", aStack.pop());
    assertFalse(aStack.isEmpty());
    assertEquals("first", aStack.pop());
    assertTrue(aStack.isEmpty());
  }
        
  @Test (expected = EmptyStackException.class)
  public void getTopWhenEmpty() {
    LinkedStack<Integer> aStack = new LinkedStack<Integer>();
    aStack.getTop();
  }
  
  @Test (expected = EmptyStackException.class)
  public void popWhenEmpty() {
    LinkedStack<Integer> aStack = new LinkedStack<Integer>();
    aStack.pop();
  }
}

