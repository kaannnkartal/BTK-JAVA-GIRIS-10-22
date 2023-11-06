package miniProjeMuqSayı;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
			
			int sayi = scan.nextInt();
			
			int bolenToplam = 0;
			
			for(int i = 1 ; i<sayi;i++) {
				
				if(sayi % i ==0) {
					bolenToplam += i;
				}
			}
			
			if(bolenToplam == sayi) {
				System.out.println("Süper sayı");
			}
			else
				System.out.println("Süper sayı değil");
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		

	}

}
