package Uas;

public class Data {
      private long nim;
      private String nama, gender;

      public Data(long nim, String nama, String gender) {
            this.nim = nim;
            this.nama = nama;
            this.gender = gender;
      }

      public void setNim(long nim) {
            this.nim = nim;
      }

      public void setNama(String nama) {
            this.nama = nama;
      }

      public void setGender(String gender) {
            this.gender = gender;
      }

      public long getNim() {
            return nim;
      }

      public String getNama() {
            return nama;
      }

      public String getGender() {
            return gender;
      }

}