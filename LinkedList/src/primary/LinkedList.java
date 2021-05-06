package primary;

public class LinkedList {
      private Node headPtr = null;

      // constructor untuk membuat list kosong
      public LinkedList() {
            headPtr = null;
      }

      // memasukan node pada head
      public void insertFirst(int data) {
            // membuat object node baru
            Node newFirst = new Node(data);
            // menentukan next pada node
            // node yang dimasukan dalam list pertama kali akan memiliki ekor null
            newFirst.setNext(headPtr);
            // mengisi nilai headPtr dengan alamat memory object node yang dibuat ini, agar nanti dapat dimasukan pada node baru
            headPtr = newFirst;
      }

      // membuat fungsi traverse untuk mencetak setiap node yang ada
      public void traverse() {
            Node ptr = this.headPtr;
            while (ptr  != null) {
                  System.out.println(ptr);
                  ptr = ptr.getNext();
            }
      }

      

}