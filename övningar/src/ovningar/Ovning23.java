package ovningar;
import java.util.Scanner;
public class Ovning23 {

	public static void main(String[] args) {
		Scanner skanna = new Scanner(System.in);
		
		System.out.println("Skriv in en text");
		String text = skanna.nextLine();
		
		text = text.replace('m', 'x');
		
		System.out.println(text);
		
		skanna.close();
	}
//rätt
}
