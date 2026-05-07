import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TheStackTest{
    TheStack testing;
    @BeforeEach
      public void setUp() {
      testing = new TheStack(3);


    }
    @Test
    public void testThatStackIsEmptyOnCreation(){
       assertTrue(testing.isEmpty());

    }

    @Test
    public void testThatStackSizeIsZeroOnCreation(){
        assertEquals(0, testing.size());
    }
    @Test
    public void testThatAnItemIsAddedToTheStack(){
        testing.push(10);
        assertEquals(1, testing.size());
    }
    @Test
    public void testThatTwoItemsAreAddedToTheStack() {
        testing.push(10);
        testing.push(20);
        assertEquals(2, testing.size());
    }
    @Test
    public void testThatAnItemAddedLastIsRemovedFirstInTheStack() {
        testing.push(10);
        testing.push(20);

        assertEquals(20, testing.pop());

    }
    @Test
    public void testThatTheSizeOfTheStackIsReducedWhenAnItemIsPopped(){
        testing.push(10);
        testing.push(20);
        testing.pop();
        assertEquals(1,testing.size());
    }
    @Test
    public void testThatAnItemAddedFirstIsRemovedLastInTheStack() {
        testing.push(10);
        testing.push(20);
        testing.pop();

        assertEquals(10, testing.pop());

    }
    @Test
    public void testThatLastValueIsAtTheTopOfTheStack(){
        testing.push(10);
        testing.push(20);
        assertEquals(20,testing.peek());

    }
    @Test
    public void testThatFirstValueIsAtTheTopAfterLastValueIsRemoved(){
        testing.push(10);
        testing.push(20);
        testing.pop();

        assertEquals(10,testing.peek());

    }
    @Test
    public void testThatTheStackIsFull(){
        testing.push(10);
        testing.push(20);
        testing.push(30);
        assertTrue(testing.isFull());
    }
    @Test
    public void testThatPopAnEmptyStackWillThrowAnException(){

        assertThrows(RuntimeException.class, () -> testing.pop());
    }
    @Test
    public void testThatPushOnFullStackWillThrowAnException(){
        testing.push(10);
        testing.push(20);
        testing.push(30);
        assertThrows(RuntimeException.class, () -> testing.push(50));

    }
}