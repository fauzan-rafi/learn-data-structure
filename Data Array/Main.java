import java.util.*;
public class Main {
      public static void main(String[] args) {
            // instance object
            Scanner sc = new Scanner(System.in);
            //menu awal
            System.out.println("Silahkan masukan jumlah array");
            int size = sc.nextInt();
            LatihanArray latihanArray = new LatihanArray(size);

            // insert element ke array
            for (int i = 0; i < size; i++) {
                  System.out.print("Array[ "+ i +" ] = ");
                  int element = sc.nextInt();
                  latihanArray.inputArrar(element);
            }

            //show element array
            latihanArray.showArray();

            // find array
            boolean find = true;
            while (find) {
                  System.out.print("data apa yg dicari ? ");
                  int cari = sc.nextInt();
                  boolean result = latihanArray.findArray(cari);
                  if( result == false ){
                        System.out.println("Data tidak ditemukan");
                  }else{
                        System.out.println("Data " + cari + " Ditemukan");
                  }

                  System.out.println("Mau tetap stay ?(true/false)");
                  find = sc.nextBoolean();
            }

            boolean del = true;
            while (del) {
                  System.out.print("Data mana yg mau dihapus ? ");
                  int element = sc.nextInt();
                  latihanArray.delArray(element);
                  latihanArray.showArray();
                  System.out.println("Mau tetap stay ?(true/false)");
                  del = sc.nextBoolean();
            }

            
            sc.close();
      }
}
