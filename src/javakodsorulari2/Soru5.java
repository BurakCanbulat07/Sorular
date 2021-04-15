package javakodsorulari2;

import java.util.Scanner;

public class Soru5 {
	/* 
	Kullanıcını 1 ile 7 arasında bir sayı girdiğinde haftanın hangi günü olduğunu yazdıran switch case java kodunu yazinız.
			 */
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("1 ile 7 arasinda bir sayi girin");
	int gun =scan.nextInt();
	
	switch (gun) {
	case 1:
		System.out.println("pazartesi");
		break;
	case 2:
		System.out.println("sali");
		break;
	case 3:
		System.out.println("carsamba");
		break;
	case 4:
		System.out.println("persembe");
		break;
	case 5:
		System.out.println("cuma");
		break;
	case 6:
		System.out.println("cumartesi");
		break;
	case 7:
		System.out.println("pazar");
		break;

	default:
		System.out.println("Gecersiz sayi");
		break;
	}
scan.close();}
}
