package switchDemo;

public class Main {

	public static void main(String[] args) {

		char grade = 'X';

		switch (grade) {
		case 'A':
			System.out.println("harika");
			break;
		case 'B':
			System.out.println("Nice");
			break;
		case 'C':
			System.out.println("Not Bad");
			break;
		case 'D':
			System.out.println("Bad");
			break;
		case 'F':
			System.out.println("GG");
			break;
		default:
			System.out.println("GEÇERSİZ");
			break;

		}

	}

}
