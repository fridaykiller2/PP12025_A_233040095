package Pertemuan8;

public class ListMkTest {
  public static void main(String[] args) {
    StrukturList list = new StrukturList();

    list.addHead(new Matakuliah("IF002", "Pemrograman Web", "3"));
    list.addHead(new Matakuliah("IF001", "Dasar Pemrograman", "4"));


    list.displayElement();
  }

}