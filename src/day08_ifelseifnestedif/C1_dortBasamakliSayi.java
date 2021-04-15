package day08_ifelseifnestedif;

import java.util.Scanner;

public class C1_dortBasamakliSayi {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 4 basamakli bir sayi girin");
		int sayi=scan.nextInt();
		
		if (sayi>9999&&sayi<1000) {
			if (sayi%5==0) {
				if (sayi%10==0) {
					System.out.println("5 e bolunebilen cift sayi");
				} else {
					System.out.println("5 e bolunebilen tek sayi");
				}
			} else {
				System.out.println("Tekrar deneyin");
		}} else {
			System.out.println("Sayi 4 basamakli degil");
		}
		scan.close();
	}

}
