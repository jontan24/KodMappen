package inl�mningar;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Inl�mning1b {

	public static void main(String[] args) {
		Scanner skanna = new Scanner(System.in);
		
		System.out.println("Ange ditt namn");
		String namn= skanna.nextLine();
		namn = namn.toUpperCase();
				
		DecimalFormat df= new DecimalFormat(".##");
		
		System.out.println("Ange din timl�n");
		double hourly = skanna.nextDouble();
		
		System.out.println("Ange antalet arbetade timmar");
		double timmar = skanna.nextDouble();

		double salary = (hourly * timmar);
		
		String output = (namn + " du tj�nade " + df.format(salary) + " kr f�rra veckan."); 
		
		System.out.println(output);
		
		skanna.close();
		
				

	}

}
