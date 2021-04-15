package javakodsorulari3;

import java.util.Scanner;

public class Soru4 {
	/*
	Get numbers from the user and output that number consecutive fibonacci number sequence
	     	e.g : User enters 10
	output : 0 1 1  2  3  5 8 13 21 34
	      	*/

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Bir sayi girin");
		int sayi=scan.nextInt();
		
		int bir=0;
		int iki=1;
		
		int toplam=0;
		
		if(sayi==1){
			System.out.print(bir+" ");
		} if(sayi==2){
			System.out.print(bir+" "+iki+" ");
		} if (sayi>2){
			System.out.print(bir+" "+iki+" ");
		for (int i = 0; i <sayi-2; i++) {
			toplam=bir+iki;
			bir=iki;
			iki=toplam;
			System.out.print(toplam+" ");
		}
		}
	scan.close();}
}
