import java.util.LinkedList;

public class Tugas2_LinkedList {
  public static void main(String[] args) {
      LinkedList <String> kamu = new LinkedList<String>();
      kamu.add("M");
      kamu.add("V");
      kamu.add("Z");
      LinkedList <String> saya = new LinkedList<String>();
      saya.add("L");
      saya.add("U");
      saya.add("T");
      saya.add("F");
      saya.add("I");
      saya.add("A");
      saya.add(" ");
      saya.add("A");
      saya.add("U");
      saya.add("L");
      saya.add("I");
      saya.add("A");
      System.out.println("Isi LinkedList: "+saya+" Ukuran: "+saya.size());
      //Add karakter lain
      saya.addFirst("B");
      saya.addLast("R");
      System.out.println("\nSetelah di Add: "+saya+" Ukuran: "+saya.size());
      saya.add(3,"C");
      saya.add(7,"L");
      saya.addAll(kamu);
      System.out.println("\nSetelah di Add: "+saya+" Ukuran: "+saya.size());
      //Sisipkan karakter lain
      saya.set(6,"P");
      saya.set(4,"O");
      saya.set(9,"J");
      System.out.println("\nSetelah disisipkan: "+saya+" Ukuran: "+saya.size());
      //Hapus beberapa karakter
      saya.removeFirst();
      saya.removeLast();
      System.out.println("\nSetelah dihapus: "+saya+" Ukuran: "+saya.size());
      saya.remove(8);
      saya.remove(0);
      System.out.println("\nSetelah dihapus: "+saya+" Ukuran: "+saya.size());
      //Fungsi pop
      saya.pop();
      saya.pop();
      System.out.println("\nSetelah menggunakan fungsi pop: "+saya+" Ukuran: "+saya.size());
      //fungsi push
      saya.push("L");
      saya.push("Q");
      System.out.println("\nSetelah menggunakan fungsi push: "+saya+" Ukuran: "+saya.size());
  }  
}
