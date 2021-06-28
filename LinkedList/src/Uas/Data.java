package Uas;

public class Data {
      private int nim;
      private String nama,gender;

      public Data(int nim,String nama,String gender){
            this.nim = nim;
            this.nama = nama;
            this.gender = gender;
      }

      public void setNim(int nim) {
            this.nim = nim;
      }

      public void setNama(String nama) {
            this.nama = nama;
      }

      public void setGender(String gender) {
            this.gender = gender;
      }

      public int getNim() {
            return nim;
      }

      public String getNama() {
            return nama;
      }

      public String getGender() {
            return gender;
      }

}