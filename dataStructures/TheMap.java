public class TheMap {

    String[] keys;
    int[] values;
    int size;

    public TheMap(int capacity) {
        keys = new String[capacity];
        values = new int[capacity];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }


    public void put(String key, int value) {
        for (int i = 0; i < size; i++) {
            if (keys[i].equals(key)) {
                values[i] = value; // update
                return;
            }
        }
        keys[size] = key;
        values[size] = value;
        size++;
    }


    public int get(String key) {
        for (int i = 0; i < size; i++) {
            if (keys[i].equals(key)) {
                return values[i];
            }
        }
        return -1;
    }

    public void remove(String key) {
        for (int i = 0; i < size; i++) {
            if (keys[i].equals(key)) {
                // shift left
                for (int j = i; j < size - 1; j++) {
                    keys[j] = keys[j + 1];
                    values[j] = values[j + 1];
                }
                size--;
                return;
            }
        }
    }

    public boolean containsKey(String key) {
        return get(key) != -1;
    }
}