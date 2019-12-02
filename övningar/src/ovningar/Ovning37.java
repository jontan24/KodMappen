package ovningar;
import java.util.Scanner;
public class Ovning37 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Skriv din ålder");
		int ålder = scan.nextInt();
		int pensionsålder = 65;
		int pensionom = pensionsålder - ålder; 
		if( ålder < 65) { System.out.print("du går i pension om " + pensionom + " år");
	}

}
}