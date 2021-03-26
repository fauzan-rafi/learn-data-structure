package Mahasiswa;

import java.util.*;

public class App {

      public static void main(String[] args) {
            // instance object
            Scanner scanner = new Scanner(System.in);
            ArrayMhs arrayMhs;
            System.out.println();
            System.out.println("Data masih kosong anda harus mengisi terlebuh dahulu");
            System.out.println();
            System.out.println("Lanjut? true/false");
            boolean lanjut = scanner.nextBoolean();
            if (lanjut == true) {
                  try {
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
                  boolean stay;
                  do{
                        System.out.println("1.Mau mencari data ");
                        System.out.println("2.Hapus data ");
                        System.out.println("3.Tampilkan data");
                        System.out.println("4.Keluar");
                        int choise = scanner.nextInt();
                              if( choise == 1){
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
                        }else if( choise == 2 ){
                              System.out.print("Data apa yg mau dihapus ? ");
                              String nama = scanner.next();
                              boolean result = arrayMhs.delMhs(nama);
                                    if (result == true ) {
                                          System.out.println("Data berhasil dihapus");
                                          System.out.println();
                                          arrayMhs.showArray();
                                    } else {
                                          System.out.println("Data tidak ditemukan sehingga tidak bisa dihapus");
                                          System.out.println();
                                          arrayMhs.showArray();
                                    }     
                        }
                        else if(choise == 3){
                              arrayMhs.showArray();
                        }
                        else if(choise == 4){
                              System.exit(1);
                        }

                        System.out.println("Stay : true / false?");
                        stay = scanner.nextBoolean();
                     }while(stay);

                  } catch (Exception e) {
                        System.out.println("Silahkan masukan inputan yang benar");
                  } 
          }else{
                System.exit(1);
          }  
      }
}
