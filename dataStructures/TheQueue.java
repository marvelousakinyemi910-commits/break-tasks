public class TheQueue {
    int[] spaces;
    int front;
    int back;
    int size;
    int maximumLimit;

    public TheQueue(int maximumLimit) {
        this.maximumLimit = maximumLimit;
        spaces = new int[maximumLimit];
        front = 0;
        back = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maximumLimit;

    }

    public int size() {
        return size;
    }


    public void add(int value) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }
            spaces[++back] = value;
            size++;

    }

    public int remove() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
            int value = spaces[front++];
            size--;
            return value;


    }
    public int peek(){
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return spaces[front];

    }

}