package Tugas_pertemuan10;

public class StrukturStack {
    private int[] array;
    private int capacity;
    private int TOP;

    public final int MIN = -1;

    public StrukturStack(int capacity) {
        super();
        array = new int[capacity];
        this.capacity = capacity;
        TOP = MIN;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong, tidak bisa pop");
            return -1;
        } else {
            int data = array[TOP];
            TOP--;
            return data;
        }
    }


    
    public boolean isFull() {
        return TOP == capacity - 1;
    }
    
    public int size() {
        return TOP + 1;
    }
    
    public int top() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return -1;
        }
        return array[TOP];
    }

   
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack penuh");
        }
        else {
            TOP++;
            array[TOP] = data;
             
        }
    }

    public boolean isEmpty() {
        return (TOP == MIN);
    }

    public void displayElements() {
    if (isEmpty()) {
        System.out.println("Stack kosong");
    } else {
        for (int i = TOP; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

}