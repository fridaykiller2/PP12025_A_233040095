package Tugas_pertemuan10;

public class StackMain {
    public static void main(String[] args) {
        StrukturStack stack = new StrukturStack(3);

        System.out.println("sebelum pop");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.displayElements();
       
        System.out.println("Pop: " + stack.pop());


        System.out.println("Setelah pop");

        System.out.println("isFull: " + stack.isFull());
        System.out.println("isEmpty: " + stack.isEmpty());
        System.out.println("Top: " + stack.top());
        System.out.println("Size: " + stack.size());
        stack.displayElements();

        // System.out.println("#Sebelum push");
        // System.out.println("Size: " + stack.size());
        // System.out.println("Empty: " + stack.isEmpty());
        // System.out.println("Full: " + stack.isFull());
        // System.out.println("Top: " + stack.top());
        // System.out.println("Elemen from TOP: ");
       

        // System.out.println("#Melakukan push 3x:");
        // stack.push(2);
        // stack.push(4);
        // stack.push(1);
        // System.out.println("push 2; push 4; push 1");

        // System.out.println("Size: " + stack.size());
        // System.out.println("Empty: " + stack.isEmpty());
        // System.out.println("Full: " + stack.isFull());
        // System.out.println("Top: " + stack.top());
        // System.out.print("Elemen from TOP: ");
        // stack.displayElements();
       


       
    }

    
}