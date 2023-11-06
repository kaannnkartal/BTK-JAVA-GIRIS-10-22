package miniProjeAsalSayı;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
	Scanner scan = new Scanner(System.in);
	
	boolean flag = true;
	
	
	while(flag) {
		boolean control = false;
		int sayı = scan.nextInt();
		
		for(int i = sayı-1; i>1;i--) {
			
			if(sayı % i == 0) {
				System.out.println("SAYI ASAL DEĞİL");
				control = true;
				break;
			}
		}
		
		if(!control) {
			System.out.println("SAYI ASAL");
		}
		
		
		
	}

	}

}
