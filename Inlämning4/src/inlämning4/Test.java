package inl�mning4;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Account j = new Account();
		Scanner scan = new Scanner(System.in);
		System.out.println("skriv in ditt kontonummer");
		Continue con = new Continue();
		
		boolean exit = false;
		
		String tmpNbr = scan.nextLine();
		j.setNbr(tmpNbr);
		j.setBalance(600);
		
		
		System.out.println(" Kontonummer: " + tmpNbr);
		System.out.println("du har nu balance " + j.getBalance());
		
		j.credit(1000);
		System.out.println("du har nu balance " + j.getBalance());
		
		j.withdraw(900);
		System.out.println("du har nu balance " + j.getBalance());
		
		
		while( exit == false) {
			System.out.println("vill du s�tta in eller ta ut pengar? 0 = ins�ttning, 1= uttag ");
			int a = scan.nextInt();
			if(a == 0) {
				System.out.println("Ange belopp");
				double bal = scan.nextDouble();
				System.out.println("Saldo:" + (j.getBalance() + bal));
				exit = con.bool();
			}else if(a ==1) {
				System.out.println("Ange belopp");
				double bal = scan.nextDouble();
				System.out.println("Saldo:" + (j.getBalance() - bal));
				exit = con.bool();
			}else {
				System.out.println("Felaktigt svar");
				
			}
		}//klart j�vla king
		
	}

}
