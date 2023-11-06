
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int toplam = topla(1,2,3,4,5);
		System.out.println(toplam);
	}
	
	public static int topla (int... sayilar) {
		
		int toplam = 0;
		
		for(int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;
		
		
		
	}

}
