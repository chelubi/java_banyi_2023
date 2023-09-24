/**
 * Бані, компмех, завдання 2.2
 * @author oleksandrbani
 * @version 1.0
 */


package second;

import java.util.Scanner;

public class second_two {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String n_1 = scan.nextLine();
		double n_2 = scan.nextDouble();
		scan.close();
		
		int num_1 = n_1.length();
		int num_2 = (int) (Math.log10(n_2) + 1);
		
		System.out.println("К-сть розрядів числа №1 = " + num_1 + ", числа №2 = " + num_2);
		
		Double garm = 1/(1/Double.parseDouble(n_1) + 1/n_2);
	    System.out.printf("Середнє гармонічне цих чисел = %.2f\n", garm);

		
	}
}
