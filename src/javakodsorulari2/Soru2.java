package javakodsorulari2;

import java.util.Scanner;

public class Soru2 {
	/*
    Print "Lütfen iş unvanınızı girin” 
    “jobTitle” isimli bir degisken olusturun ve kullanicidan isteyin.
    Doğru jobTitle yazdırmak için aşağıdaki test datalarini kullanın. Example :
    Eger jobTitle  qa ise print “İş unvanınız Quality Analyst” 
    test data: qa ise print Quality Analyst 
    dev ise print Developer 
    ba ise print Business Analyst 
    pm ise print Project Manager
   */
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Lutfen is unvanini girin");
	String jobTitle=scan.next().toLowerCase();
	
	if (jobTitle.equals("qa")) {
		System.out.println("Is unvaniniz: Quality Analyst");
	}else if (jobTitle.equals("dev")) {
		System.out.println("Is unvaniniz: Developer");
	}else if (jobTitle.equals("ba")) {
		System.out.println("Is unvaniniz: Bussines Analyst");
	}else if (jobTitle.equals("pm")) {
		System.out.println("Is unvaniniz: Project Manager");
	}else {
		System.out.println("Gecersiz unvan");
	}
	
	scan.close();}
}
