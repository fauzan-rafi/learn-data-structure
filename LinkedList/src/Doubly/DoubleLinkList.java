package Doubly;

import java.util.*;

class DoubleLinkList {
	public static void main(String[] args) {
		DoubleLink list = new DoubleLink();
		System.out.println("Data pertama, {22,22.99} dimasukkan dengan insertFirst");
		list.insertFirst(22, 22.99);
		list.tampilMaju();
		System.out.println("");
		list.insertFirst(44, 44.99);
		System.out.println("Memasukkan data ke-2, {44, 44.99}, di depan");
		list.tampilMaju();
		list.insertLast(11, 11.99);
		list.insertLast(33, 33.99);
		System.out.println("");
		System.out.println("Memasukkan data ke-3 --> {11, 11.99} dan ke-4 --> {33, 33.99}, di belakang");
		list.tampilMaju();
		System.out.println("");
		System.out.println("Menampilkan data dari depan ke belakang");
		list.tampilMaju();
		System.out.println("");
		System.out.println("Menampilkan data dari belakang ke depan");
		list.tampilMundur();
		list.deleteFirst();
		System.out.println("");
		System.out.println("Menghapus data paling depan, {44, 44.99}");
		list.tampilMaju();
		list.deleteLast();
		System.out.println("");
		System.out.println("Menghapus data paling belakang, {33, 33.99}");
		list.tampilMaju();
		list.hapus(11);
		System.out.println("");
		System.out.println("Menghapus data {11,11.99}");
		list.tampilMaju();
		list.insertAfter(22, 77, 77.99);
		System.out.println("");
		System.out.println("Memasukkan data {77,77.99} setelah data {22,22.99}");
		list.tampilMaju();
		list.insertAfter(22, 88, 88.99);
		System.out.println("");
		System.out.println("Memasukkan data {88,88.99} setelah data {22,22.99}");
		list.tampilMaju();
		
	} // end main()
} // end class DoubleLinkList
////////////////////////////////////////////////////////////////