/*NIM 		: 13020210067
NAMA		: YAYANG NURAVIN NABILAH
HARI/TANGGAL	: SELASA,21 MARET 2023*/

import java.util.Scanner;
public class If1 {
	public static void main(String[] args) {
	Scanner masukan=new Scanner(System.in); 
	int a;

	System.out.print ("Contoh IF satu kasus \n"); 
	System.out.print ("Ketikkan suatu nilai integer : "); 
	a = masukan.nextInt();
	if (a >= 0)
	System.out.print ("\nNilai a positif "+ a);
	}
}