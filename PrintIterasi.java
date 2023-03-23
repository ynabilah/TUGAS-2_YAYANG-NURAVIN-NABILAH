/*NIM 		: 13020210067
NAMA		: YAYANG NURAVIN NABILAH
HARI/TANGGAL	: SELASA,21 MARET 2023*/

import java.util.Scanner;
public class PrintIterasi {
	public static void main(String[] args) {
	
	int N;
	int i;
	Scanner masukan=new Scanner(System.in);

	System.out.print ("Nilai N > 0 = "); /* Inisialisasi*/
	N = masukan.nextInt();

	i = 1; 
	System.out.print ("Print i dengan ITERATE : \n");
	for (;;){
		System.out.println(i); 
		if (i == N)
		break;
		else {
		i++;
		}
	} 

	}
}
