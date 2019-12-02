package inlämning4;

import java.util.Scanner;

public class Continue {
	Account j = new Account();

	public boolean bool() {
		String exit;

		Scanner scan = new Scanner(System.in);

		System.out.println("vill du fortsätta? (J / N)?");
		exit = scan.next();
		if (exit.contentEquals("J")) {
			return false;
		} else if (exit.contentEquals("N")) {
			return true;
		} else {
			System.out.println("Felaktigt svar! Forstätter.");
			return false;
		}
	}

}
