package Doubly;

class DoubleLink {
	private Node first; // pointer first digunakan untuk menunjukkan awal list
	private Node last; // pointer last digunakan untuk menunjukkan akhir list
	// -------------------------------------------------------------

	public DoubleLink() { // constructor
		first = null; // pointer first diinisialisasi agar tidak menunjuk ke suatu Node tertentu
		last = null; // pointer last diinisialisasi agar tidak menunjuk ke suatu Node tertentu
	}

	// -------------------------------------------------------------
	public boolean isEmpty() { // bernilai true jika tidak ada data
		return first == null;
	}

	// -------------------------------------------------------------
	// memasukkan data di awal list
	public void insertFirst(int dat1, double dat2) {
		Node newNode = new Node(dat1, dat2);
		if (isEmpty())
			last = newNode;
		else
			first.previous = newNode;
		newNode.next = first;
		first = newNode;
	}

	// -------------------------------------------------------------
	// memasukkan data di akhir list
	public void insertLast(int dat1, double dat2) {
		Node newNode = new Node(dat1, dat2);
		if (isEmpty())
			first = newNode;
		else {
			last.next = newNode;
			newNode.previous = last;
		}
		last = newNode;
	}

	// -------------------------------------------------------------
	// menghapus data di awal list
	public Node deleteFirst() {
		Node temp = first;
		if (first.next == null)
			last = null;
		else
			first.next.previous = null;
		first = first.next;
		return temp;
	}

	// -------------------------------------------------------------
	// menghapus data di akhir list
	public Node deleteLast() {
		Node temp = last;
		if (first.next == null)
			first = null;
		else
			last.previous.next = null;
		last = last.previous;
		return temp;
	}

	// -------------------------------------------------------------
	// memasukkan data setelah data tertentu
	public boolean insertAfter(int dat, int dat1, double dat2) {
		Node indek = first;
		while (indek.Data1 != dat) {
			indek = indek.next;
			if (indek == null)
				return false; // data tidak ditemukan
		}
		Node newNode = new Node(dat1, dat2);
		if (indek == last) {
			// newNode.next = null;
			last = newNode;
		} else {
			newNode.next = indek.next;
			indek.next.previous = newNode;
		}
		newNode.previous = indek;
		indek.next = newNode;
		return true; // data ditemukan dan data baru dimasukkan
	}

	// -------------------------------------------------------------
	// menghapus data tertentu (tidak diawal maupun diakhir list)
	public Node hapus(int dat) {
		Node indek = first;
		while (indek.Data1 != dat) {
			indek = indek.next;
			if (indek == null)
				return null; // data tidak ditemukan
		}
		if (indek == first)
			first = indek.next;
		else
			indek.previous.next = indek.next;

		if (indek == last)
			last = indek.previous;
		else
			indek.next.previous = indek.previous;
		return indek;
	}

	// -------------------------------------------------------------
	public void tampilMaju() {
		System.out.print("List (first-->last): ");
		Node indek = first;
		while (indek != null) {
			indek.tampilNode();
			indek = indek.next;
		}
		System.out.println("");
	}

	// -------------------------------------------------------------
	public void tampilMundur() {
		System.out.print("List (last-->first): ");
		Node indek = last;
		while (indek != null) {
			indek.tampilNode();
			indek = indek.previous;
		}
		System.out.println("");
	}
	// -------------------------------------------------------------
} // end class DoubleLink