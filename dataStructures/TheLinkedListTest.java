import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TheLinkedListTest {

    @Test
    public void testAddAndGet() {
        TheLinkedList list = new TheLinkedList();

        list.add("A");
        list.add("B");

        assertEquals("A", list.getFirst());
        assertEquals("B", list.getLast());
    }

    @Test
    public void testAddFirst() {
        TheLinkedList list = new TheLinkedList();

        list.add("B");
        list.addFirst("A");

        assertEquals("A", list.getFirst());
    }

    @Test
    public void testRemoveFirst() {
        TheLinkedList list = new TheLinkedList();

        list.add("A");
        list.add("B");

        list.removeFirst();

        assertEquals("B", list.getFirst());
        assertEquals(1, list.size());
    }

    @Test
    public void testRemoveLast() {
        TheLinkedList list = new TheLinkedList();

        list.add("A");
        list.add("B");

        list.removeLast();

        assertEquals("A", list.getLast());
        assertEquals(1, list.size());
    }

    @Test
    public void testThatListIsEmpty() {
        TheLinkedList list = new TheLinkedList();

        assertTrue(list.isEmpty());

        list.add("A");

        assertFalse(list.isEmpty());
    }
}

