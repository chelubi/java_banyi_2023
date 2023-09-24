/**
 * Бані, компмех, завдання 2.4
 * @author oleksandrbani
 * @version 1.0
 */


package second;

import java.util.Scanner;

public class second_four {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Введіть C"); 
		double c = scan.nextDouble();
		double f = 9*c/5+32;
		System.out.printf("F = " + f);
		scan.close();
		
	}
}
