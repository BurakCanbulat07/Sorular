package javakodsorulari;

import java.util.Scanner;

public class Soru5 {
	/*
	Iki degisken atayin : 
	num1=1,
	num2=1 
	‘increment’ yontemini kullanarak Carpim Tablosunu yazdirin.
	Note: ++ increment isareti 1 arttirir. 
	Asagidaki sekilde Carpim Tablosunu yazdirin:
	1 X 1 = 1
	1 X 2 = 2  
	1 X 3 = 3
	...
	1 X 10 =10
	*/
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Birinci rakami girin");
	int num1=scan.nextInt();
	System.out.println("Ikinci rakami girin");
	int num2=scan.nextInt();
	
	if (num1==0) {
		System.out.println("0'in tum sayilara carpimi 0'dir");
	}else if (num1>0&&num1<11&&num2>=0&&num2<11) {
		for ( int i =num2; i<=10; i++) {
		System.out.println(num1+" X "+i+" = "+(num2*i));
		}
		}else {
			System.out.println("gecersiz sayi");
		}
	
scan.close();}
}
