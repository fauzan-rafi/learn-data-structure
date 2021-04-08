
import java.util.*;

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
              System.out.println("4. Buat data queue baru <clear data>");
              System.out.println("5. Queue ingfo");
              System.out.println("6. Keluar");
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
                                    System.out.println("Queue penuh !! kosongkan data dahulu"); 
                              }
                        }// akhir dari menu 1
                        /* ----------------------------------------------------------------------- */
                        // menu 2
                        else if( pilih == 2){
                              if(queue.isEmpty()){
                              System.out.println("Data Masih kosong");
                              }else{
                              System.out.println("Data >> "+  queue.poll() + " << telah dikeluarkan");
                              }
                              System.out.println();
                        } // akhir dari menu 2
                        /* ----------------------------------------------------------------------- */
                        // menu 3
                        else if( pilih == 3){
                              if (queue.isEmpty()) {
                              System.out.println("Data masih kosong");
                              } else {
                              queue.printArr();
                              }
                              System.out.println();
                        } // akhir dari menu 3
                        /* ----------------------------------------------------------------------- */
                        //menu 4
                        else if( pilih == 4){
                              queue.clean();
                              queue.queueIngfo();
                        } //akhir dari menu 4
                        /* ----------------------------------------------------------------------- */
                        else if (pilih == 5) {
                              System.out.println("-------------------------");
                              queue.queueIngfo();
                              System.out.println("-------------------------");
                        }//akhir dari menu 5
                        /* ----------------------------------------------------------------------- */
                        // menu 6
                        else if( pilih == 6){
                              boolean result = false;
                              do{
                              System.out.println("Apakah anda yakin untuk keluar ? Y/N");
                              try {
                                    String exit = scan.next(); 
                                    if (exit.equals("Y")) {
                                          System.exit(1);
                                    }
                              } catch (InputMismatchException e) {
                                    System.out.println("Anda salah memasukan input !!");
                                    result = true;
                              }
                              }while(result);
                        }// akhir menu 6
                        /* ----------------------------------------------------------------------- */
                        else{
                              System.out.println("Something wrong i can feel it");
                        }
                  } catch (InputMismatchException e) {
                        System.out.println("Masukan angka yang benar");// handle exception
                  }
            }while(true);
      }	
}


