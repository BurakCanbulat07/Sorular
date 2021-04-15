package javakodsorulari;

public class Soru1 {
	/*
	Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz. 
	String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	*/ 
public static void main(String[] args) {
	String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	String A=pickName.substring(0, 1);
	String L=pickName.substring(11, 12);
	String i=pickName.substring(8,9).toLowerCase();
	System.out.println(A+" "+L+" "+i);
}
}
