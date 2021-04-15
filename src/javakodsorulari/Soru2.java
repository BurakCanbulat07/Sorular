package javakodsorulari;

import java.util.Scanner;

public class Soru2 {
	/*
	Kullaniciya gunde kac cay ictigini ve cayi kac sekerli ictigini sorun. Daha sonra kullanicinin yilda kac kg seker kullandigini hesaplayan java kodunu yaziniz.
	1 seker= 1.7 gr
	Ornek: Input     
	Cay : 10
	Seker :2
	Output : 12.41 kg/yil
	*/  
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Gunde kac cay icersiniz");
	double cay=scan.nextInt();
	System.out.println("Cayi kac sekerli icersiniz");
	double seker=scan.nextInt();
	
	double gunlukSeker=cay*seker;
	double yillikSeker=gunlukSeker*365;
	double sekerGr=yillikSeker*1.7;
	double sekerKg=sekerGr/1000;
	
	if (cay>=0&&seker>=0) {
	System.out.println("Bir yilda cay icerek "+sekerKg+" kg seker tuketiyorsunuz");
	}else {
		System.out.println("Gecersiz sayi");
	}
	
scan.close();}
}
