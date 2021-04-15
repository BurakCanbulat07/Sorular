package javakodsorulari2;

import java.util.Scanner;

public class Soru1 {
	/*
    Kullanicidan email girmesini isteyin
   @ isareti icermiyorsa “gecerli bir email girin” yazdirin
   @ isaretinden sonra sadece “gmail.com” yaziyorsa “email onaylandi” yazdirin
   @ isaretinden sonra “gmail.com” disinda birsey yaziyorsa “Lutfen gmail hesabinizi girin” yazdirin
   ORNEK:
   INPUT : techproed.com OUTPUT : “gecerli bir email girin”
   INPUT : techproed@gmail.com OUTPUT : “email onaylandi”
   INPUT : techproed@hotmail.com OUTPUT : “Lutfen gmail hesabinizi girin”
   */
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Email giriniz");
		String email=scan.next();
		
		email=email+"a";		
		
		
		if (email.contains("@")) {
			if (email.contains("gmail.com")) {
				System.out.println("email onaylandi");
			} else {
				System.out.println("lutfen gmail hesabinizi girin");
			}
		}else {
			System.out.println("Lutfen gecerli bir email girin");
		}
	scan.close();
	}
}
	