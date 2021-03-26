package Mahasiswa;

public class ArrayMhs {
      private Mahasiswa[] arrayMahasiswas;
      private int index;

      public ArrayMhs(int size) {
            arrayMahasiswas = new Mahasiswa[size];
            index = 0;
      }

      // mencari data
      public Mahasiswa findArray(String nama) {
            int i;
            for (i = 0; i < arrayMahasiswas.length; i++) {
                if (arrayMahasiswas[i].getNamaMhs().equals(nama)) {
                    break;
                }
            }
            if (i == arrayMahasiswas.length) {
                  return null;
            }else{
                  return arrayMahasiswas[i];
            }
      }

      // insert data to array
      public void insertMhs(String nama,String alamat,double ipk) {
            arrayMahasiswas[index] = new Mahasiswa(nama,alamat,ipk);
            index++;
      }

      // method menghapus data
      public boolean delMhs(String nama){
            int i;
            for(i=0; i < index - 1; i++){
                  String name = arrayMahasiswas[i].getNamaMhs();
                  if( name.equals(nama) )
                  break;
            }
            
            if(i == index){ // data tidak ditemukan
                  return false;
            }else if(i == index-1){
                  arrayMahasiswas[i] = arrayMahasiswas[i-1];
                  index--;
                  return true;
            }else { // data ditemukan
                  for(int j = i; j < index-1; j++){ // dihapus dengan shifting
                        arrayMahasiswas[j] = arrayMahasiswas[j+1];
                  }
                  index--;
                  return true;
            }
      }

      //method print array
      public void showArray() {
            String garis = "---------------------------";
            System.out.println("");
            System.out.println(garis);
            System.out.println("Nama ------ Alamat -----IPK");
            System.out.println(garis);
            for (int i = 0; i < index; i++) {
                  arrayMahasiswas[i].showMhs();
            }
            System.out.println(garis);
            System.out.println();
      }

}
