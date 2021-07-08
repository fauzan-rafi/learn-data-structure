package Uas;

import java.util.*;

public class UasDoubleApp {

      public static  long inputNim() {
            Scanner scanner = new Scanner(System.in);
            int loop = 0;
            long nim = 0;
            while(loop == 0) {
                  System.out.print("Masukan NIM : ");
                  try {
                        nim = scanner.nextLong();
                        loop = 1;
                  }
                  catch(InputMismatchException e) {
                        System.out.println("Masukan harus berupa Angka!");
                        loop = 0;
                  }
            }
            return nim;
      }
      
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          UasLink link = new UasLink();
          System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
          System.out.println(">               Welcome to app v1.1              <");
          System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
          do {
              System.out.println(">------------------------------------------------<");
              System.out.println("Pilih Menu :");
              System.out.println("1. Masukan data");
              System.out.println("2. Menghapus data");
              System.out.println("3. Mengupdate data ");
              System.out.println("4. Menampilkan data ");
              System.out.println("5. Menemukan data");
              System.out.println("6. Hapus semua data");
              System.out.println("7. Keluar");
              System.out.println(">------------------------------------------------<");
              
              try {
                  System.out.print("Anda Pilih : ");
                  double pilih = scanner.nextDouble();
                  System.out.println("--------------------------------------------------");
  
                  if( pilih == 1){
                        System.out.print("Nama : ");
                        String nama = scanner.next();
                        System.out.print("NIM : ");
                        long nim = scanner.nextLong();
                        System.out.print("Jenis Kelamin(L/W) : ");
                        String gender = scanner.next();
                        if(link.insertData(nama, nim, gender) ){
                              System.out.println("Data berhasil ditambahkan");
                        }else{
                              System.out.println("Data gagal ditambahkan, silahkan periksa Nim anda kembali !!! ");
                        }
                        System.out.println();
                        // link.sortData();
                        // link.sortGroup();
                        link.tampilMaju();
                        
                  }
                  else if( pilih == 2){
                        long temp = inputNim();
                        if(link.findData(temp) == null){
                              System.out.println("Data gagal dihapus");
                        }else{
                              link.delData(temp);
                        }
                        link.tampilMaju();
                  } 
  
                  else if( pilih == 3){
                        long temp = inputNim();
                        if(link.findData(temp) != null)
                              link.findData(temp).updateShow();
                              link.updateData(temp);
                              link.tampilMaju();
                  }
  
                  else if( pilih == 4){
                        // link.sortData();
                        link.tampilMaju();
                  }

                  else if( pilih == 5){
                        long temp = inputNim();
                        if(link.findData(temp) != null){
                              link.findData(temp).updateShow();
                        }else{
                              System.out.println("Data tidak ada");
                        }
                  }

                  else if( pilih == 6){
                        link.clearList();
                        link.tampilMaju();
                  }
  
                  else if( pilih == 7){
                      boolean result = false;
                      do{
                          System.out.println("Apakah anda yakin untuk keluar ? Y/N");
                          try {
                              String exit = scanner.next(); 
                              if (exit.equals("Y")) {
                                  System.exit(1);
                              }
                          } catch (InputMismatchException e) {
                              System.out.println("Anda salah memasukan input !!");
                              result = true;
                          }
                      }while(result);
                  }
                  else{
                      System.out.println("Something wrong i can feel it");
                  }
              } catch (InputMismatchException e) {
                  System.out.println("Masukan angka");
              }
              
          } while (true);
      }
  }