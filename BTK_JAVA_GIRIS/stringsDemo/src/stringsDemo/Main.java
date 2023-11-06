package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";

		// char array

		System.out.println(mesaj);

		/*System.out.println(mesaj.length());

		System.out.println(mesaj.charAt(4));

		System.out.println(mesaj.concat(" Yaşasın!"));
		
		// String birleştirme
		
		System.out.println(mesaj.startsWith("B"));
		
		System.out.println(mesaj.endsWith("."));
		
		char[] karakterler = new char[5];
		
		mesaj.getChars(0, 5, karakterler, 0);
		
		System.out.println(karakterler);
		
		System.out.println(mesaj.indexOf("Bu")); */
		
		
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		
		
		System.out.println(mesaj.substring(2,5));
		
		
		String [] kelimeler = mesaj.split(" ");
		
		/*for(int i = 0; i<kelimeler.length;i++) {
			System.out.println(kelimeler[i]);
		}*/
		
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		
		System.out.println(mesaj.toLowerCase());
		
		System.out.println(mesaj.toUpperCase());
		
		
		String cümle = "        SELAM       ";
		
		System.out.println(cümle.trim());
		
		
	}

}
