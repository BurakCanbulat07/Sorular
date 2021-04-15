package javakodsorulari3;

public class Soru3 {
	/*
	Verilen String icerisindeki tekrar eden karakterleri yazdiran Java kodunu yaziniz. 
	String str=“ilovejavatoo” 
	Output: o v a
	         */
	public static void main(String[] args) {
	String s="ilovejavatoo";
	String tekrar="";
	
	for (int i = 0; i < s.length(); i++) {
		for (int j = i+1; j < s.length(); j++) {
		if(s.charAt(i)==s.charAt(j) && tekrar.indexOf(s.charAt(i))<0) {
			tekrar+=s.charAt(i);
			}
		}
	}
	System.out.println(tekrar);
	}
}

