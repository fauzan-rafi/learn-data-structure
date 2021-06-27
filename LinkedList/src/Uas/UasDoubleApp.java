package Uas;

import java.util.*;

public class UasDoubleApp {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          UasLink link = new UasLink();
          System.out.println();
          do {
              System.out.println("-----------------------------------------");
              System.out.println("Pilih Menu :");
              System.out.println("1. Masukan data");
              System.out.println("2. Menghapus data");
              System.out.println("3. Mengupdate data ");
              System.out.println("4. Menampilkan data ");
              System.out.println("5. Menemukan data");
              System.out.println("6. Keluar");
              System.out.println("------------------------------------------");
              
              try {
                  System.out.print("Anda Pilih : ");
                  double pilih = scanner.nextDouble();
                  System.out.println("--------------------------------------");
  
                  if( pilih == 1){
                        System.out.println("Nama :");
                        String nama = scanner.next();
                        System.out.println("NIM : ");
                        int nim = scanner.nextInt();
                        System.out.println("Jenis Kelamin(L/W) : ");
                        String gender = scanner.next();
                        link.insertData(nama, nim, gender);
                  }
  
                  else if( pilih == 2){
                      System.out.print("NIM dihapus : ");
                      link.delData(scanner.nextInt());
                  } 
  
                  else if( pilih == 3){
                        int loop = 0;
                              int nim = 0;
                              while(loop == 0) {
                                    System.out.print("Masukkan NIM (angka): ");
                                    try {
                                          nim = scanner.nextInt();
                                          loop = 1;
                                    }
                                    catch(InputMismatchException e) {
                                          System.out.println("Masukan harus berupa Angka!");
                                          loop = 0;
                                    }
                              }
                        link.updateData(nim);
                  }
  
                  else if( pilih == 4){
                        link.tampilMaju();
                  }

                  else if( pilih == 5){
                        int loop = 0;
                              int nim = 0;
                              while(loop == 0) {
                                    System.out.print("Masukkan NIM (angka): ");
                                    try {
                                          nim = scanner.nextInt();
                                          loop = 1;
                                    }
                                    catch(InputMismatchException e) {
                                          System.out.println("Masukan harus berupa Angka!");
                                          loop = 0;
                                    }
                              }
                        link.findData(nim);
                        
                  }
  
                  else if( pilih == 6){
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