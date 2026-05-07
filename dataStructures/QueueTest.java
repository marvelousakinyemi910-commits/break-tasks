import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    TheQueue queue;

    @Test
    void testThatQueueIsEmptyAtCreation(){
        queue = new TheQueue(2);
        assertTrue(queue.isEmpty());
    }


}