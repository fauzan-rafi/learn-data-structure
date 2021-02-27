import java.util.Scanner;

class latArray {
      Scanner sc = new Scanner(System.in);

      // function untuk menampilkan data
      public void printArray(int[] array) {
            System.out.println("isi array sebagai berikut : ");
            System.out.println("");
            System.out.print("[ ");
            for (int i = 0; i < array.length; i++) {
                  System.out.print(array[i] + " ");
            }
            System.out.print("]");
            System.out.println();
      }

      // function untuk mencari data
      public void findArray(int[] array, int x) {
            for (int i = 0; i < array.length; i++) {
                  if (array[i] == x) {
                        System.out.println("Data " + x + " berada pada index - " + (i + 1));
                        break;
                  }

                  if (i == (array.length - 1)) {
                        System.out.println("Data tidak ditemukan");
                        break;
                  }
            }
      }

      // untuk menghapus elemen array
      public void delArray(int[] array, int x) {
            int temp= array[0];
            for (int i = 0; i < array.length; i++) {
                  if (array[i] == x) {
                        for (int j = i; j < array.length - 1; j++) {
                              array[j] = array[j + 1];
                        }
                        // array[array.length - 1] =temp;
                        break;
                  }

                  if (i == (array.length - 1)) {
                        System.out.println("Data tidak ditemukan");
                        break;
                  }
            }
      }

      // untuk keluar dari program
      public int keluar() {
            System.out.println("Apakah anda ingin keluar?");
            System.out.println("1. untuk keluar");
            System.out.println("2. tidak keluar");
            int result = sc.nextInt();
            if (result == 1) {
                  return 1;
            } else if (result == 2) {
                  return 2;
            } else {
                  return 0;
            }
      }

      public static void main(String[] args) {
            // inisialisasi array
            latArray latarray = new latArray();
            // inisialisasi scanner
            Scanner scan = new Scanner(System.in);
            // Menu awal
            System.out.println("Selamat datang,apakah anda ingin lanjut?");
            System.out.println("1. untuk lanjut");
            System.out.println("2. untuk exit");
            //menerima input  keputusan
            int keputusan = scan.nextInt();

            try {
                  //jika user ingin keluar
                  if (keputusan == 2) {
                        System.exit(0);
                  } 
                  if (keputusan == 1) {
                        // memasukan data
                        System.out.println("Silahkan masukan jumlah data anda");
                        // mendapatkan data
                        int nData = scan.nextInt();
                        int[] larik = new int[nData];
                        // memasukan isi array
                        int k = 1;
                        for (int i = 0; i < nData; i++) {
                              System.out.println("Masukan data ke " + k);
                              int input = scan.nextInt();
                              larik[i] = input;
                              k++;
                        }

                        //menu setelah data pada array terisi
                        int chosse = 0;
                        do {

                              // menu menampilkan,menghapus,mencari elemen array
                              System.out.println("Apa yang ingin anda lakukan selanjutnya?");
                              System.out.println("1. Menampilkan data");
                              System.out.println("2. Mencari data");
                              System.out.println("3. Menghapus data");
                              System.out.println("4. Keluar");

                              // menerima inputan keputusan
                              int kData = scan.nextInt();
                              // kondisi berdasar kan inputan
                              // kondisi jika user ingin menampilkan data
                              if (kData == 1) {
                                    latarray.printArray(larik);
                                    chosse = latarray.keluar();
                              } //kondisi jika user ingin mencari data
                              else if (kData == 2) {
                                    System.out.println("Silahkan masukan data yang mau dicari : ");
                                    int data = scan.nextInt();
                                    latarray.findArray(larik, data);
                                    latarray.printArray(larik);
                                    chosse = latarray.keluar();
                              } //kondisi jika user ingin menhapus data
                              else if (kData == 3) {
                                    System.out.println("Silahkan masukan data yang mau dihapus : ");
                                    int data = scan.nextInt();
                                    latarray.delArray(larik, data);
                                    latarray.printArray(larik);
                                    chosse = latarray.keluar();
                              } //kondisi jika user ingin keluar 
                              else if (kData == 4) {
                                    System.exit(1);
                              } else {
                                    System.out.println("Mohon masukan keputusan yang benar");
                              }
                              //perulangan jika user tidak ingin langsung
                        } while (chosse == 4 || chosse == 2);

                  }
            //catch Exception
            } catch (Exception e) {
                  System.out.println("Your input must 1 / 2 !!" + e);
            }
            // close scanner
            scan.close();
      }//end of main method
}//end of class