package pertemuan9;

public class queueMin {
     StrukturQueue queue = new StrukturQueue();

    public static void main(String[] args) {
        StrukturQueue queue = new StrukturQueue();


         System.out.println("### Sebelum Enqueue 4x ###");
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        queue.displayElements();
        System.out.println();

        // Enqueue 4 elemen
        queue.enqueue(2);
        queue.enqueue(7);
        queue.enqueue(6);
        queue.enqueue(1);

        System.out.println("### Setelah Enqueue 4x ###");
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        queue.displayElements();
        System.out.println("Front: " + queue.front());
        System.out.println();

        // Lakukan 2x dequeue
        queue.dequeue();
        queue.dequeue();

        System.out.println("### Setelah Dequeue 2x ###");
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        queue.displayElements();
        System.out.println("Front: " + queue.front());
    

        // System.out.println("### Sebelum Enqueue 4x ###");
        // System.out.println("size: " + queue.size());
        // System.out.println("isEmpty: " + queue.isEmpty());
        // queue.displayElements();
        // System.out.println();

        // // Enqueue 4 elemen: 2, 7, 6, 1
        // queue.enqueue(2);
        // queue.enqueue(7);
        // queue.enqueue(6);
        // queue.enqueue(1);

        // System.out.println("### Enqueue 4x ###");
        // System.out.println("size: " + queue.size());
        // System.out.println("isEmpty: " + queue.isEmpty());
        // queue.displayElements();
        // System.out.println("Front: " + queue.front());

        // System.out.println("### Sebelum Enqueue 3x ###");
        // System.out.println("size: " + queue.size());
        // System.out.println("isEmpty: " + queue.isEmpty());
        // System.out.println();

        // // Enqueue 3 elemen
        // queue.enqueue(3);
        // queue.enqueue(5);
        // queue.enqueue(7);

        // System.out.println("### Enqueue 3x ###");
        // System.out.println("size: " + queue.size());
        // System.out.println("isEmpty: " + queue.isEmpty());
        // System.out.println("Front: " + queue.front());
    }
}