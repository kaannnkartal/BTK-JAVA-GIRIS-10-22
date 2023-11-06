package workingWithFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void createFile() {
		File file = new File("students.txt");

		try {
			if (file.createNewFile()) {
				System.out.println("Dosya oluşturuldu");
			} else
				System.out.println("Dosya zaten mevcut");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void getFileInfo() {
		File file = new File("students.txt");
		if (file.exists()) {
			System.out.println("Dosya Adı " + file.getName());
			System.out.println("Dosya Yolu " + file.getAbsolutePath());
			System.out.println("Dosya Okunabilir mi " + file.canRead());
			System.out.println("Dosya Yazılabilir mi " + file.canWrite());
			System.out.println("Dosya Boyutu (BYTE) " + file.length());
		}
	}
	
	
	public static void readFile() {
		File file = new File("students.txt");
		
		try {
			Scanner reader = new Scanner(file);
			while(reader.hasNextLine()) {
				String line = reader.nextLine();
				
				System.out.println(line);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void writeFile() {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("students.txt",true));
			
			writer.write("Ahmet");
			System.out.println("Dosyaya Yazıldı");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {

		// createFile();
		//getFileInfo();
		readFile();
		writeFile();
	}

}
