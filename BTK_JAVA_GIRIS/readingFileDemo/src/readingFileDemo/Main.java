package readingFileDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		int total = 0;
		BufferedReader reader = new BufferedReader(new FileReader("sayilar.txt"));
		
		String line = null;
		
		try {
			while((line = reader.readLine()) !=null ) {
				total+= Integer.valueOf(line);
			}
			
			System.out.println(total);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
