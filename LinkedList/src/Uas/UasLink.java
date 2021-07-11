package Uas;

import java.util.*;

class UasLink {
	Scanner scanner = new Scanner(System.in);
      private Node first; // pointer first digunakan untuk menunjukkan awal list
	private Node last;  // pointer last digunakan untuk menunjukkan akhir list
	private int l = 0;
	private int w = 0;
// -------------------------------------------------------------
	public UasLink() { // constructor
		first = null; // pointer first diinisialisasi agar tidak menunjuk ke suatu Node tertentu
		last = null;  // pointer last diinisialisasi agar tidak menunjuk ke suatu Node tertentu
	}
// -------------------------------------------------------------
	public boolean isEmpty() { // bernilai true jika tidak ada data
		return first==null;
	}

// -------------------------------------------------------------
	// memasukkan data dengan ketentuan tidak ada nim yang sama
	// done .
	public boolean insertData(String dat1, long dat2, String dat3) {
            Node indek = first;
            Node newNode = new Node(dat1,dat2,dat3);
            boolean result = false;
            if( isEmpty() ){
                  first = newNode;
                  last = newNode;
                  result = true;
		}else {
                  while(indek.data.getNim() != dat2) {
                        if(indek == last){
                              last.next = newNode;
                              newNode.previous = last;
                              last = newNode;
                              result = true;
                              break;
                        }
                        indek = indek.next;
			}
            }
            return result;
	}
// --------------------------------------------------------------------------
	// menghapus data tertentu (tidak diawal maupun diakhir list)
	public boolean delData(long nim) {
		boolean result = false;
		Node index = first;
		while(index != null) {
			if(index.data.getNim() == nim){
				result = true;
				break;
			}
			index = index.next;
		}

		if(index == first){
			first = index.next;
            }else{
			index.previous.next = index.next;
            }

		if(index == last){
			last = index.previous;
		}else{
			index.next.previous = index.previous;
		}
		return result;
 	}
 
// ------------------------------------------------------------

	public void tampilMaju() {
		System.out.println("--------------------------------------------------");
		System.out.printf("[ %-25s |%-15s |%-5s ]%n","Nama","Nim","Gender");
		System.out.println("--------------------------------------------------");
		if (this.first == null && this.last == null) {
			System.out.println("Data kosong");
		}else{
			this.sortData();
			this.sortGroup();
		}
		
	}

// -------------------------------------------------------------
	public void sortData() {
		Node current = null, index = null;  
		Data temp;  
		//Check whether list is empty  
		if(first == null) {  
			return;  
		}else {  
		//Current will point to first  
			for(current = first; current.next != null; current = current.next) {  
				//Index will point to node next to current  
				for(index = current.next; index != null; index = index.next) {  
					//If current's data is greater than index's data, swap the data of current and index  
					if(current.data.getNim() > index.data.getNim()) {  
						temp = current.data;  
						current.data = index.data;  
						index.data = temp;  
					}  
				}  
			}  
		}   
	}
// -------------------------------------------------------------

	public void sortGroup() {
		Node index = first;
		while (index != null) {
			if (index.data.getGender().equals("L")) {
				index.tampilNode();
				this.l++;
			} 
			index = index.next;
		}
		index = first;
		while (index != null) {
			if (index.data.getGender().equals("W")) {
				index.tampilNode();
				this.w++;
			} 
			index = index.next;
		}
		System.out.println("");
	}

// ----------------------------------------------------------
// Find data untuk menemukan data tertentu dalam linked 
      public Node findData(long nim){
            Node index = first;
            while(index != null) {
			if(index.data.getNim() == nim){
				break;
			} 
                  index = index.next;
		}
		if(index == null){
			index = null;
		}   

		return index;
	}
//---------------------------------------------------------------------------------------
	public void updateData(long nim) {
		Node index = this.findData(nim);
		System.out.println();
		String oldName = index.data.getNama();
		long oldNim = index.data.getNim();
		String oldGender = index.data.getGender();
		boolean trial = false;
		System.out.println("Data apa yang ingin diganti ???");
		System.out.println("1. Edit Nama");
		System.out.println("2. Edit Nim");
		System.out.println("3. Edit Gender");
		System.out.println();
			int select = scanner.nextInt();
			switch (select) {
				case 1:
					System.out.print("Masukkan Nama (String): ");
					try {
						String newNama = scanner.next();
						trial = this.editData(newNama, oldNim, oldGender ,index);
						
					}
					catch(InputMismatchException e) {
						System.out.println("Masukan harus berupa String!");
					}
					break;
				case 2:
					System.out.print("Masukkan Nim (Angka): ");
					try {
						long newNim = scanner.nextLong();
						trial = this.editData(oldName, newNim, oldGender,index);
						if( !trial ){
							System.out.println("Data dengan nim yang sama sudah ada !!!");
						}
					}
					catch(InputMismatchException e) {
						System.out.println("Masukan harus berupa Angka!");
					}
					break;
				case 3:
					System.out.print("Masukkan Gender (L/W): ");
					try {
						String newGender = scanner.next();
						trial = this.editData(oldName, oldNim, newGender, index);
					}
					catch(InputMismatchException e) {
						System.out.println("Masukan harus berupa String!");
					}
					break;
				default:
					break;
			}
		System.out.println();
		if(trial)
			index.updateShow();
		else
			System.out.println("Data Tidak ter-update");
	} 
		
	
// ---------------------------------------------------------------------------------------
	public boolean editData(String dat1, long dat2, String dat3,Node node) {
		boolean result = false;
		Node newNode = node;
		if(validateNim(dat2,node) == true){
			newNode.setNama(dat1);
			newNode.setNim(dat2);
			newNode.setGender(dat3);
			result = true;
		}

		return result;
	}
// -------------------------------------------------------------

	public boolean validateNim(long nim,Node node) {
		boolean result = true;
		Node index = this.first;
		while (index != null ) {
			if(index.data.getNim() == nim && index != node){
				result = false;
				break;
			}
			index = index.next;
		}
		return result;
	}

// --------------------------------------------------------------

	public void clearList() {
		this.first = null;
		this.last = null;
	}

	public void appIngfo(){
		int total = this.l+this.w;
		if (this.first == null && this.last == null) {
			System.out.println("Data kosong");
		}else{
			System.out.println("App Ingfo");
			System.out.println("Total data store : " + total);
			System.out.println("Total data Laki-laki store : " + this.l);
			System.out.println("Total data Wanita store : " + this.w);
			this.tampilMaju();
		}
	}
}