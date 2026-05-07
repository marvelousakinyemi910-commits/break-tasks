import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TheSetTest {
    TheSet set;

    @BeforeEach
    public void setUp() {
        set = new TheSet(3);
    }

    @Test
    public void testThatSetIsEmptyOnCreation() {
        assertTrue(set.isEmpty());
    }
    @Test
    public void testThatSizeOfTheSetIsZeroOnCreation(){
       assertEquals (0,set.size());
    }
    @Test
    public void testThatA_valueIsAddedToTheSet(){
        set.add(10);
        assertEquals (1,set.size());

}
    @Test
    public void testThatDuplicateValuesAreAddedAsOne(){
        set.add(10);
        set.add(20);
        set.add(20);
        assertEquals (2,set.size());
    }

    @Test
    public void testThatASetContainsAValue(){
        set.add(10);
        set.add(20);
        assertTrue(set.contains(10));
    }
    @Test
    public void testThatASetDoesNotContainAValue(){
        set.add(10);
        set.add(20);
        assertFalse(set.contains(30));
    }
    @Test
    public void testThatA_valueIsRemovedFromTheSet(){
        set.add(10);
        set.add(20);
        boolean removed = set.remove(10);
        assertTrue(removed);
    }
    @Test
    public void testThatTheSetDoesNotContainTheValueRemoved(){
        set.add(10);
        set.add(20);
        set.remove(10);

        assertFalse(set.contains(10));
    }
    @Test
    public void testThatTheSetSizeIsReducedAfterRemovingA_value(){
        set.add(10);
        set.add(20);
        set.remove(10);
        assertEquals(1,set.size());

    }
    @Test
    public void testThatTheSetIsNotEmptyAfterAddingA_Value(){
        set.add(10);
        assertFalse(set.isEmpty());
    }

    @Test
    public void testThatTheSetIsFull(){
        set.add(10);
        set.add(20);
        set.add(30);
        assertTrue(set.isFull());
    }
}