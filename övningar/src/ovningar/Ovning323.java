package ovningar;

import java.util.Scanner;

public class Ovning323 {

	public static void main(String[] args) {
		Scanner skanna = new Scanner (System.in);
			System.out.println("Ange tal");
			int tal = skanna.nextInt();
			int max;
			int min;
			if (tal == 0 ) { 
				System.out.println(" Inget tal inl�st");
			}
				else {  int i = 2;
						max = tal;
						min = tal; 
			
				while(tal != 0) {
					System.out.println("ange tal" + i + ":");
					tal = skanna.nextInt();
					if (tal > max) { max= tal;
					}
					if(tal < min) {min=tal;} i++;}//avslut while
				
				System.out.println("max " + max);
				System.out.println("min " + min);
				}
			skanna.close();
	}

}
