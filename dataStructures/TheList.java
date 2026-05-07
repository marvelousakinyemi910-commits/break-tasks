
    public class TheList {

        String[] elements;
        int size;

        public TheList(int capacity) {
            elements = new String[capacity];
            size = 0;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }


        public void add(String value) {
            elements[size++] = value;
        }


        public String get(int index) {
            return elements[index];
        }

        public void set(int index, String value) {
            elements[index] = value;
        }


        public void remove(String value) {
            for (int i = 0; i < size; i++) {
                if (elements[i].equals(value)) {
                    for (int j = i; j < size - 1; j++) {
                        elements[j] = elements[j + 1];
                    }
                    size--;
                    return;
                }
            }
        }
    }


