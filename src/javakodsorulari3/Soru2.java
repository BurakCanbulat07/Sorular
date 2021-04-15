package javakodsorulari3;

public class Soru2 {
	public static void main(String[] args) {
		//a) 1-20 arasindaki -20 dahil olmak üzere-  çift sayıları yazdırın. e.g.2 4 6 .. 20
		for (int i = 0; i <21; i++) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		//b) 1-20 arasindaki -20 dahil olmak üzere-  tek sayıları yazdırın. e.g 1,3,5,7,...,19 Virgul dahil!
		String donus="";
		for (int i = 0; i <21; i++) {
			if (i%2==1) {
				donus+=i+",";
			}
		}
		donus=donus.substring(0, donus.length()-1);
		System.out.println(donus);

		//c) 20 ile 1 arasindaki 5 e bolunebilen sayillari 20 den geriye gelerek yazdirin. e.g.20,15,10,5
		String cikis="";
		for (int i = 20; i >0; i--) {
			if (i%5==0) {
				cikis+=i+",";
			}
		}
		cikis=cikis.substring(0, cikis.length()-1);
		System.out.println(cikis);
		
		//d) 1 - 20 arasındaki tüm çift sayıların toplamını bulun.
		int toplam=0;
		for (int i = 0; i <21; i++) {
			if (i%2==1) {
				toplam+=i;
			}
		}
		System.out.println(toplam);
		
		//e) 11 veya 15 hariç 1-20 arasındaki tüm sayıları yazdırın; break or continue kullanin.
		for (int i = 0; i < 21; i++) {
			if (i==11) {
			continue;
			}
			if (i==15) {
				continue;
			}
			System.out.print(i+" ");
		}
	}


}
