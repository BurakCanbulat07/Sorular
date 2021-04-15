package javakodsorulari;

import java.util.Scanner;

public class Soru4 {
	/*
	Kullanicidan 3 basamakli bir sayi isteyin ve bu sayinin basamaklari toplamini konsolda yazdiran programi yaziniz.
	*/
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Uc basamakli bir sayi girin");
	int sayi=scan.nextInt();
	
	if (sayi<1000&&sayi>99) {
		int birlerBas=sayi%10;
		sayi/=10;
		int onlarBas=sayi%10;
		sayi/=10;
		int yuzlerBas=sayi;
		
		int toplam=birlerBas+onlarBas+yuzlerBas;
		System.out.println("Girdiginiz sayinin basamaklari toplami: "+toplam);
	} else {
		System.out.println("Sayi 3 basamakli degil");
	}
scan.close();}
}
