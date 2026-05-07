
    public class TheLinkedList {

        class Node {
            String data;
            Node next;

            Node(String data) {
                this.data = data;
            }
        }

        Node head;
        Node tail;
        int size;

        public boolean isEmpty() {
            return head == null;
        }

        public int size() {
            return size;
        }


        public void add(String value) {
            Node newNode = new Node(value);

            if (isEmpty()) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }


        public void addFirst(String value) {
            Node newNode = new Node(value);

            if (isEmpty()) {
                head = tail = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
            size++;
        }


        public String getFirst() {
            return head.data;
        }

        public String getLast() {
            return tail.data;
        }


        public void removeFirst() {
            if (isEmpty()) return;

            head = head.next;
            if (head == null) tail = null;
            size--;
        }


        public void removeLast() {
            if (isEmpty()) return;

            if (head == tail) {
                head = tail = null;
            } else {
                Node current = head;
                while (current.next != tail) {
                    current = current.next;
                }
                current.next = null;
                tail = current;
            }
            size--;
        }

}
