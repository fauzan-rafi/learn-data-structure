package Uas;

class Node {
	public Data data;
	public Node next; // pointer (link) untuk terhubung dengan Node berikutnya
	public Node previous; // pointer (link) untuk terhubung dengan Node sebelumnya

	public Node(String Nama, long Nim, String Gender) {
		Data temp = new Data(Nim, Nama, Gender);
		this.data = temp;
	}

	// -------------------------------------------------------------
	public void tampilNode() {
		System.out.printf("[ %-25s | %-15d | %-6s ]%n", data.getNama(), data.getNim(), data.getGender());
	}

	public void updateShow() {
		System.out.println("1. Nama = " + data.getNama());
		System.out.println("2. Nim = " + data.getNim());
		System.out.println("3. Gender = " + data.getGender());
	}

	public void setNama(String nama) {
		this.data.setNama(nama);
	}

	public void setGender(String gender) {
		this.data.setGender(gender);
	}

	public void setNim(long nim) {
		this.data.setNim(nim);
	}
}