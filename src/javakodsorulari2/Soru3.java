package javakodsorulari2;

import java.util.Scanner;

public class Soru3 {
	/*
	“NestedIfStatements” class olusturun.
	
Kullanicidan 2 kisi icin dogum gunu girmesini isteyin.
	
Yılı, ayi ve günü tamsayı olarak alın e NestedIf kullanarak kimin yas olarak daha buyuk oldugunu ekrana yazdirin. 
Examples:
	int birthYearOfYusuf=2000, birthMonthOfYusuf=12, birthDayOfYusuf=12,
	int birthYearOfMehmet=2000,birthMonthOfMehmet=12, birthDayOfMehmet=21;
	Yusuf is Older            
*/
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	
	System.out.println("1. kisinin adini girin");
	String ad1=scan.nextLine();
	System.out.println("2. kisinin adini girin");
	String ad2=scan.nextLine();
	
	System.out.println("1. kisinin dogum yilini girin");
	int yil1=scan.nextInt();
	System.out.println("1. kisinin dogum ayini sayi olarak girin");
	int ay1=scan.nextInt();
	System.out.println("1. kisinin dogum gununu sayi olarak girin");
	int gun1=scan.nextInt();
	
	System.out.println("2. kisinin dogum yilini girin");
	int yil2=scan.nextInt();
	System.out.println("2. kisinin dogum ayini sayi olarak girin");
	int ay2=scan.nextInt();
	System.out.println("2. kisinin dogum gununu sayi olarak girin");
	int gun2=scan.nextInt();
	
	if (yil1>2021||yil1<1||yil2>2021||yil2<1||ay1>12||ay1<1||ay2>12||ay2<1||gun1>31||gun1<1||gun2>31||gun2<1) {
		System.out.println("Gecersiz");
	}else {
		if (yil1<yil2) {
				System.out.println(ad1+" daha buyuk");
			}else if (yil1==yil2&&ay1<ay2) {
				System.out.println(ad1+" daha buyuk");
			}else if (yil1==yil2&&ay1==ay2&&gun1<gun2) {
				System.out.println(ad1+" daha buyuk");
			}else {
				System.out.println(ad2+" daha buyuk");
			}
	}
	scan.close();}


}

