package inl�mningar;
import java.util.Scanner;
public class Inl�mning1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Skriv ett ord");
		String ord1 = scan.nextLine();
				
		System.out.println("Skriv ett till ord");
		String ord2 = scan.nextLine();
		String ord3 = ord1 + " " + ord2;
		
		int sum = ord3.length(); 
		
		System.out.println(ord3 + "\n" + sum);
	
		scan.close();

	}

}
