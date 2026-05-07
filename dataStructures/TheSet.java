public class TheSet {
    int[] spaces;
    int size;

    public TheSet(int maximumLimit) {
        spaces = new int[maximumLimit];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == spaces.length;

    }
    public int size(){
        return size;
    }
    public void add(int value){
        if(contains(value)) return;
        spaces[size++] = value;
    }

    public boolean remove(int value) {
        for (int index = 0; index < size; index++) {
            if (spaces[index] == value) {
                for (int secondIndex = index; secondIndex < size - 1; secondIndex++) {
                    spaces[secondIndex] = spaces[secondIndex + 1];
                }
                size--;
                return true;
            }
        }
        return false;
    }
    public boolean contains(int value ){
        for (int index = 0; index < size; index++){
            if (spaces[index] == value) return true;
        }
            return false;
    }
}