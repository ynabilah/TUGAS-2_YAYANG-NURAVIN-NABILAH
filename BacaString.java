/*NIM 		: 13020210067
NAMA		: YAYANG NURAVIN NABILAH
HARI/TANGGAL	: SELASA,21 MARET 2023*/

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;

import javax.swing.*; 
public class BacaString {	
	public static void main(String[] args) throws IOException {
	String str;
	BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));

	System.out.print ("\nBaca string dan Integer: \n"); 
	System.out.print("masukkan sebuah string: ");
	str= datAIn.readLine();
	System.out.print ("String yang dibaca : "+ str);
	}
}
