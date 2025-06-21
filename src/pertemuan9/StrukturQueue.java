package pertemuan9;

import org.w3c.dom.Node;

public class StrukturQueue {
    private node front;
    private node rear;

    public StrukturQueue() {
        front = null;
        rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int data) {
        node newNode = new node(data);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
    }

    public int size() {
        int size = 0;
        node curNode = front;
        while (curNode != null) {
            size++;
            curNode = curNode.getNext();
        }
        return size;
    }

    public int front() {
        return front != null ? front.getData() : -1;
    }

    public void displayElements() {
        if (isEmpty()) {
            System.out.println("Elemen Queue: Queue kosong");
        } else {
            System.out.print("Elemen Queue: ");
            node curNode = front;
            while (curNode != null) {
                System.out.print(curNode.getData() + " ");
                curNode = curNode.getNext();
            }
            System.out.println();
        }
    }

    public void dequeue() {
    if (isEmpty()) {
        System.out.println("Queue kosong, tidak bisa dequeue.");
    } else {
        System.out.println("Dequeued: " + front.getData());
        front = front.getNext();

        if (front == null) {
            rear = null;
        }
    }
}

}