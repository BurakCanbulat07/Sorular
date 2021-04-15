package javakodsorulari3;

import java.util.Scanner;

public class Soru1 {
	/*
	Kullanıcıdan bir isim ve karakter girmesini isteyin
	 sonra karakterin kaç kez tekrarlandığını kontrol edin.
	e.g:
	char ch1= 'a' ;
	String name =“John came late" 
=> Tekrar Sayisi = 2
	*/

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir cumle girin");
		String cumle=scan.nextLine().toLowerCase();
		System.out.println("Bir harf girin");
		char harf = scan.next().toLowerCase().charAt(0);
	
		int tekrarSayisi = 0;
		for (int i = 0; i < cumle.length(); i++) {
			if (harf==cumle.charAt(i)) {
				tekrarSayisi++;
			}
		}
		
		System.out.println("Girdiginiz cumlede '"+harf+"' harfi "+tekrarSayisi+" kere var");
	scan.close();}
}
