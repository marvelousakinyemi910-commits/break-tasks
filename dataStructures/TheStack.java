

public class TheStack {
    int[] stackMaximumSize;
    int topElement;
    int capacity;

    public TheStack(int size){
        stackMaximumSize = new int [size];
        capacity = size;
        topElement = -1;
    }


    public boolean isEmpty(){
        return topElement == -1;
    }
    public boolean isFull() {
        return topElement == capacity -1;
    }
    public int size() {
        return topElement + 1;
    }

    public void push(int value) {
         if (isFull()) throw new RuntimeException("Stack is full");
        stackMaximumSize[++topElement] =  value;
    }

    public int pop(){
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        return stackMaximumSize[topElement--];
    }

    public int peek(){
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        return stackMaximumSize[topElement];
    }


}

