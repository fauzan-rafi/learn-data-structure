package Uas;

class Node {
      public String Nama;
	public int Nim;
	public String Gender;
	public Node next;		// pointer (link) untuk terhubung dengan Node berikutnya
	public Node previous;	// pointer (link) untuk terhubung dengan Node sebelumnya
// -------------------------------------------------------------
	public Node(String Nama, int Nim, String Gender) {
            this.Nama = Nama;
            this.Nim = Nim;
            this.Gender = Gender;
	}
// -------------------------------------------------------------
	public void tampilNode() {
		System.out.print(" {" + Nama + " , " + Nim + " , " + Gender + "} ");
	}

	public void updateShow() {
		System.out.println("1. Nama = " + Nama);
		System.out.println("2. Nim = " + Nim);
		System.out.println("3. Gender = " + Gender);
	}

	public void setNama(String nama) {
		this.Nama = nama;
	}

	public void setGender(String gender) {
		this.Gender = gender;
	}

	public void setNim(int nim) {
		this.Nim = nim;
	}
}