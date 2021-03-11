package Mahasiswa;

import java.util.*;

public class App {

      public static void main(String[] args) {
            // instance object
            Scanner scanner = new Scanner(System.in);
            ArrayMhs arrayMhs;

            // menentukan jumlah array
            System.out.print("Silahkan masukan jumah data = ");
            int size = scanner.nextInt();
            arrayMhs = new ArrayMhs(size);

            // membuat object
            for (int i = 0; i < size; i++) {
                  String nama, alamat;
                  double ipk;
                  System.out.print("Silahkan masukan Nama : ");
                  nama = scanner.next();
                  System.out.print("Silahkan masukan Alamat : ");
                  alamat = scanner.next();
                  System.out.print("Silahkan masukan IPK : ");
                  ipk = scanner.nextDouble();
                  arrayMhs.insertMhs(nama, alamat, ipk);
                  System.out.println();
            }

            // menampilkan isi array
            arrayMhs.showArray();

            // mencari data
            boolean find = true;
            while (find) {
                  System.out.print("data apa yg dicari ? ");
                  String cari = scanner.next();
                  Mahasiswa result = arrayMhs.findArray(cari);
                  if (result != null) {
                        System.out.println("Data ditemukan");
                        System.out.println();
                        result.showMhs();
                  } else {
                        System.out.println("Data tidak ditemukan");
                  }
                  System.out.println();

                  System.out.println("Mau tetap stay ?(true/false)");
                  find = scanner.nextBoolean();
            }

            // menghapus data
            boolean del = true;
            while (del) {
                  System.out.print("Data apa yg mau dihapus ? ");
                  String nama = scanner.next();
                  arrayMhs.delMhs(nama);
                  arrayMhs.showArray();
                  
                  System.out.println("Mau tetap stay ?(true/false)");
                  del = scanner.nextBoolean();
            }
      }
}
