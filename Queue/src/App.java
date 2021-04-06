import java.util.*;

import jdk.internal.org.jline.terminal.Attributes.InputFlag;

public class App {
      public static void main(String[] args) {
            Myqueue queue = new Myqueue(5);
            Scanner scan = new Scanner(System.in);
            System.out.println();
            queue.queueIngfo();
            System.out.println();
            do{
                  System.out.println("-----------------------------------------");
                  System.out.println("Pilih Menu :");
                  System.out.println("1. Tambah data queue");
                  System.out.println("2. Ambil data queue");
                  System.out.println("3. Lihat data queue");
                  System.out.println("5. Buat data queue baru <clear data>");
                  System.out.println("6. Queue ingfo");
                  System.out.println("7. Keluar");
                  System.out.println("------------------------------------------");
                  try {
                        System.out.print("Silahkan masukan pilihan anda : ");
                        int pilih = scan.nextInt();
                        System.out.println("--------------------------------------");

                        // menu 1
                        if (pilih == 1) {
                             boolean check = queue.isFull();
                             if (!check) {
                                    int loop = 0;
                                    int alpha = 0;
                                    while(loop == 0) {
                                          System.out.print("Masukkan Data (angka): ");
                                          try {
                                                alpha = scan.nextInt();
                                                loop = 1;
                                          }
                                          catch(InputMismatchException e) {
                                                System.out.println("Masukan harus berupa Angka!");
                                                loop = 0;
                                          }
                                    }
                                    queue.add(alpha);
                             }else{
                                   
                             }
                        }
                  } catch (InputMismatchException e) {
                        System.out.println("Masukan angka yang benar");// handle exception
                  }
            }while(true);

      }
}
