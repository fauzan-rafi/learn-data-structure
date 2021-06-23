package Doubly;

class Node {
	public int Data1;
	public double Data2;
	public Node next;		// pointer (link) untuk terhubung dengan Node berikutnya
	public Node previous;	// pointer (link) untuk terhubung dengan Node sebelumnya
// -------------------------------------------------------------
	public Node(int dat1, double dat2) {
		Data1 = dat1;
		Data2 = dat2;
	}
// -------------------------------------------------------------
	public void tampilNode() {
		System.out.print("{" + Data1 + ", " + Data2 + "} ");
	}
} // end class Node
////////////////////////////////////////////////////////////////

