package inlämningar;

import java.util.Scanner;

public class Inlämning3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] list = new int[5];
		int sum = 0;
		int i;
		double average;
		int highestNbr = 0;
		
		for (i = 0; i < list.length; i++) { 
			System.out.println("Ange tal " + (i+1) + ": ");
			list[i] = scan.nextInt();
			sum += list[i];
			
			if(i == 0) {
				highestNbr = list[i];
			}if (list[i] > highestNbr) {
				highestNbr = list[i];
			}
		}
		System.out.println("Summan av talen är " + sum);
		average = (double)sum/i;
		System.out.println("Medelvärdet är " + average);
		System.out.println("Det största talet är " + highestNbr);
		
		scan.close();
		}
		

}
