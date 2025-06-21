package Pertemuan6;

public class strukturListTest {
    public static void main(String[] args) {
        strukturList list = new strukturList();
        
        list.addMid(2, 0);
        list.addMid(6, 1);
        list.addMid(3, 2);
        list.addMid(5, 3);
        list.addMid(1, 4);

        System.out.println("Elemen: ");
        list.displayElement( );

        list.removeMid(3);
        list.removeMid(5);
        list.removeMid(1);

        System.out.println("\n");
        list.displayElement();
    }
}