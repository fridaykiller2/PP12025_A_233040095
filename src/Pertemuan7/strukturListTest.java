package Pertemuan7;

public class strukturListTest {
    public static void main(String[] args) {
        strukturList list = new strukturList();
        
        list.addTail(7);
        list.addTail(6);
        list.addTail(4);
        list.addTail(2);
        list.addTail(3);

        list.displayElement();

    //    System.out.println("\n" + list.size());
        
        // //latihan 2
        // list.addTail(5);
        // list.addTail(4);
        // list.addTail(6);

        // list.displayElement();
        // System.err.println("\n" + list.find(5));
    }
}