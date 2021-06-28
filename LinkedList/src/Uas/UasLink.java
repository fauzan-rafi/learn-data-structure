package Uas;

import java.util.*;

class UasLink {
	Scanner scanner = new Scanner(System.in);
      private Node first; // pointer first digunakan untuk menunjukkan awal list
	private Node last;  // pointer last digunakan untuk menunjukkan akhir list
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
	public boolean insertData(String dat1, int dat2, String dat3) {
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
// -----------------------------------------------------------------------------
	public boolean editData(String dat1, int dat2, String dat3) {
		Node indek = first;
            boolean result = false;
		while(indek.data.getNim() != dat2) {
			if(indek == last){
				indek.setNama(dat1);
				indek.setNim(dat2);
				indek.setGender(dat3);
				result = true;
				break;
			}
			indek = indek.next;
		}
            
            return result;
	}
// -------------------------------------------------------------
	// menghapus data tertentu (tidak diawal maupun diakhir list)
	public boolean delData(int dat) {
		boolean result = true;
		Node indek = first;
		while(indek.data.getNim() != dat) {
			indek = indek.next;
			if(indek == null)
				result = false;
		}

		if(indek == first){
			first = indek.next;
            }else{
			indek.previous.next = indek.next;
            }

		if(indek == last){
			last = indek.previous;
		}else{
			indek.next.previous = indek.previous;
		}
		return result;
 	}
 
// ------------------------------------------------------------

	public void tampilMaju() {
		System.out.println("{Nama | Nim | Gender}");
		System.out.println();
		Node indek = first;
		while(indek != null) {
		indek.tampilNode();
		System.out.println();
			indek = indek.next;
		}
		System.out.println("");
	}

// -------------------------------------------------------------


	public void sortData() {
	  Node current = null, index = null;  
        Data temp;  
        //Check whether list is empty  
        if(first == null) {  
            return;  
        }  else {  
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

// ----------------------------------------------------------
// Find data untuk menemukan data tertentu dalam linked 
      public void findData(int nim){
            Node indek = first;
            while(indek.data.getNim() != nim) {
			if(indek == null){
                        System.out.print("Data tidak ditemukan");
                        break;
                  }
                  indek = indek.next;
		}
		if(indek.data.getNim() == nim){
			System.out.println("Data ditemukan");
			indek.updateShow();
		}   
	}
//---------------------------------------------------------------------------------------
	public void updateData(int nim) {
		Node indek = first;
            while(indek.data.getNim() != nim) {
			if(indek == null){
                        System.out.print("Data tidak ditemukan");
                        break;
                  }
                  indek = indek.next;
		}
		if(indek.data.getNim() == nim){
			System.out.println("Data ditemukan");
			indek.updateShow();
			System.out.println("Data apa yang ingin diganti ???");
			System.out.println("1. Edit Nama");
			System.out.println("2. Edit Nim");
			System.out.println("3. Edit Gender");
			int select = scanner.nextInt();
                        switch (select) {
                              case 1:
                                    System.out.print("Masukkan Nama (String): ");
                                    try {
                                         String newNama = scanner.next();
							this.editData(newNama, indek.data.getNim(), indek.data.getGender());
							
                                    }
                                    catch(InputMismatchException e) {
                                          System.out.println("Masukan harus berupa String!");
                                    }
                                    break;
                              case 2:
						System.out.print("Masukkan Nim (Angka): ");
						try {
							int newNim = scanner.nextInt();
							boolean trial = this.editData(indek.data.getNama(), newNim, indek.data.getGender());
							if( !trial ){
								System.out.println("Nim Sudah ada !!!");
							}
						}
						catch(InputMismatchException e) {
							System.out.println("Masukan harus berupa Angka!");
						}
                                    break;
                              case 3:
						System.out.print("Masukkan Gender (String): ");
						try {
							String newGender = scanner.next();
							this.editData(indek.data.getNama(), indek.data.getNim(), newGender);
						}
						catch(InputMismatchException e) {
							System.out.println("Masukan harus berupa String!");
						}
                                    break;
                              default:
                                    break;
				}
			System.out.println();
			indek.updateShow();
		} 
		
	}
// ---------------------------------------------------------------------------------------

}