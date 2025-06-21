package Tugas_Pertemuan8;

import Pertemuan8.Matakuliah;
import Pertemuan8.StrukturList;


public class ListMkTest {
  public static void main(String[] args) {
    StrukturList list = new StrukturList();
    
    //test4
    list.addTail(new Matakuliah("IF004", "Kontruksi PL Berorientasi Objek", "3"));
    list.addTail(new Matakuliah("IF003", "Struktur Diskrit", "3"));
    list.addTail(new Matakuliah("IF002", "Pemrograman Web", "3"));
    list.addMid(new Matakuliah("IF001", "Dasar Pemrograman", "4"), 4);
    
    list.displayElement();
  }
  
}

// // tets1
// list.addTail(new Matakuliah("IF003", "Struktur Diskrit", "3"));
// list.addTail(new Matakuliah("IF002", "Pemrograman Web", "3"));
// list.addMid(new Matakuliah("IF001", "Dasar Pemrograman", "4"), 4);
// list.addHead(new Matakuliah("IF004", "Kontruksi PL Berorientasi Objek", "3"));