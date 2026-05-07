

    import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class TheMapTest {

        @Test
        public void testPutAndGet() {
            TheMap map = new TheMap(10);

            map.put("A", 50);
            map.put("B", 60);

            assertEquals(50, map.get("A"));
            assertEquals(60, map.get("B"));
        }

        @Test
        public void testThatA_valueIsUpdated() {
            TheMap map = new TheMap(10);

            map.put("A", 50);
            map.put("A", 80);

            assertEquals(80, map.get("A"));
        }

        @Test
        public void testThatA_keyIsRemoved() {
            TheMap map = new TheMap(10);

            map.put("A", 10);
            map.put("B", 20);

            map.remove("A");

            assertEquals(-1, map.get("A"));
            assertEquals(1, map.size());
        }

        @Test
        public void testThatA_mapContainsKey() {
            TheMap map = new TheMap(10);

            map.put("X", 100);

            assertTrue(map.containsKey("X"));
            assertFalse(map.containsKey("Y"));
        }

        @Test
        public void testThatTheMapIsEmpty() {
            TheMap map = new TheMap(10);

            assertTrue(map.isEmpty());

            map.put("A", 1);

            assertFalse(map.isEmpty());
        }
    }

