/*NIM 		: 13020210067
NAMA		: YAYANG NURAVIN NABILAH
HARI/TANGGAL	: RABU,22 MARET 2023*/

import java.util.Scanner;
public class PrintXWhile {
	public static void main(String[] args) {
	
	int Sum;
	int x;
	Scanner masukan=new Scanner(System.in);

	Sum = 0; /* Inisialisasi */
	System.out.print ("Masukkan nilai x (int), akhiri dengan 999 : ");
	x = masukan.nextInt();/* First Elmt*/
	while (x != 999) /* Kondisi berhenti */ { 
		Sum = Sum + x; /* Proses */
		System.out.print("Masukkan nilai x (int), akhiri dengan 999 : ");
		x = masukan.nextInt();/* First Elmt*/
	}
	System.out.println("Hasil penjumlahan = "+ Sum); 
	}
}