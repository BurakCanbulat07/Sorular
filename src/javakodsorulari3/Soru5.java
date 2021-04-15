package javakodsorulari3;

public class Soru5 {
	/* 
	String name = "Emine";
	         charAt yöntemini kullanarak konsolda tüm harfleri yazdırın.
	         */
	public static void main(String[] args) {
		String name = "Emine";
		
		String cikis="";
		for (int i = 0; i < name.length(); i++) {
			cikis+=name.charAt(i)+" ";
		}
		
		System.out.println(cikis);
	}

}
