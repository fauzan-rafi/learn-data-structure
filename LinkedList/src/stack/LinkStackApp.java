package stack;

import java.util.*;

public class LinkStackApp {
      public static void main(String[] args) {
            LinkStack stack = new LinkStack();
            Scanner scanner = new Scanner(System.in);
            System.out.println();
            stack.stackIngfo();
            System.out.println();
            do {
                  System.out.println("-----------------------------------------");
                  System.out.println("Pilih Menu :");
                  System.out.println("1. Tambah data");
                  System.out.println("2. Ambil data");
                  System.out.println("3. Lihat data paling atas");
                  System.out.println("4. Lihat semua isi data stack");
                  System.out.println("5. Buat data stack baru <clear data>");
                  System.out.println("6. Stack ingfo");
                  System.out.println("7. Keluar");
                  System.out.println("------------------------------------------");
                  
                  try {
                  System.out.print("Silahkan masukan pilihan anda : ");
                  int pilih = scanner.nextInt();
                  System.out.println("--------------------------------------");

                  // menu 1
                  if( pilih == 1){
                              int loop = 0;
                              int alpha = 0;
                              while(loop == 0) {
                                    System.out.print("Masukkan Data (angka): ");
                                    try {
                                          alpha = scanner.nextInt();
                                          loop = 1;
                                    }
                                    catch(InputMismatchException e) {
                                          System.out.println("Masukan harus berupa Angka!");
                                          loop = 0;
                                    }
                              }
                              stack.push(alpha);
                        
                  } // akhir dari menu 1
                  /* ----------------------------------------------------------------------- */
                  // menu 2
                  else if( pilih == 2){
                        System.out.println("Data >> "+  stack.pop() + " << telah dikeluarkan");
                        System.out.println();
                  } // akhir dari menu 2
                  /* ----------------------------------------------------------------------- */
                  // menu 3
                  else if( pilih == 3){
                        System.out.print("Data yang paling atas >>> " + stack.peek());
                        System.out.println();
                  } // akhir dari menu 3
                  /* ----------------------------------------------------------------------- */
                  // menu 4
                  else if( pilih == 4){
                        stack.displayStack();
                        System.out.println();
                  } // akhir dari menu 4
                  /* ----------------------------------------------------------------------- */
                  //menu 5
                  else if( pilih == 5){
                        stack.clearStack();
                        stack.stackIngfo();
                  } //akhir dari menu 5
                  /* ----------------------------------------------------------------------- */
                  else if (pilih == 6) {
                        System.out.println("-------------------------");
                        stack.stackIngfo();
                        System.out.println("-------------------------");
                  }
                  /* ----------------------------------------------------------------------- */
                  // menu 7
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
                  }// akhir menu 7
                  /* ----------------------------------------------------------------------- */
                  else{
                        System.out.println("Something wrong i can feel it");
                  }
                  } catch (InputMismatchException e) {
                  System.out.println("Masukan angka");// handle exception
                  }
                  
            } while (true);
      }
}