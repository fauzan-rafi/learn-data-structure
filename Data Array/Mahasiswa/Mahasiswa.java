package Mahasiswa;

public class Mahasiswa {
      private String namaMhs;
      private String alamatMhs;
      private double ipkMhs;

      public Mahasiswa(String nama,String alamat,double ipk) {
            namaMhs = nama;
            alamatMhs = alamat;
            ipkMhs = ipk;
      }

      public void showMhs() {
            System.out.println(namaMhs + " --- " + alamatMhs + " --- " + ipkMhs);
      }

      /**
       * @return the namaMhs
       */
      public String getNamaMhs() {
            return namaMhs;
      }


      
}
