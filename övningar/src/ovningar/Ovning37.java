package ovningar;
import java.util.Scanner;
public class Ovning37 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Skriv din �lder");
		int �lder = scan.nextInt();
		int pensions�lder = 65;
		int pensionom = pensions�lder - �lder; 
		if( �lder < 65) { System.out.print("du g�r i pension om " + pensionom + " �r");
	}

}
}