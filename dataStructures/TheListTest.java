
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TheListTest {

    @Test
    public void testAddAndGet() {
        TheList list = new TheList(10);

        list.add("A");
        list.add("B");

        assertEquals("A", list.get(0));
        assertEquals("B", list.get(1));
    }

    @Test
    public void testSet() {
        TheList list = new TheList(10);

        list.add("A");
        list.set(0, "Z");

        assertEquals("Z", list.get(0));
    }

    @Test
    public void testRemove() {
        TheList list = new TheList(10);

        list.add("A");
        list.add("B");

        list.remove("A");

        assertEquals(1, list.size());
        assertEquals("B", list.get(0));
    }

    @Test
    public void testTheSizeOfTheList() {
        TheList list = new TheList(10);

        assertEquals(0, list.size());

        list.add("A");

        assertEquals(1, list.size());
    }

    @Test
    public void testTheListIsEmpty() {
        TheList list = new TheList(10);

        assertTrue(list.isEmpty());

        list.add("A");

        assertFalse(list.isEmpty());
    }
}
