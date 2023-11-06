package arraylistTypedDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> sehirler = new ArrayList<String>();
		
		sehirler.add("Antalya");
		sehirler.add("izmir");
		sehirler.add("Bursa");
		sehirler.add("Antep");
		
		Collections.sort(sehirler);
		
		for(String sehir : sehirler) {
			System.out.println(sehir);
		}
	}

}
