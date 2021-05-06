package primary;

public class LinkedListTester {
      public static int a = 4,b = 5;
      public static void main(String[] args) {
            // Membuat list kosong
            LinkedList list = new LinkedList();
            // Membuat object baru
            list.insertFirst(5);
            // membuat object kedua
            list.insertFirst(14);
            list.traverse();
            System.out.println(""+a+" "+b);

      }
}