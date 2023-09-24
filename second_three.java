/**
 * Бані, компмех, завдання 2.3
 * @author oleksandrbani
 * @version 1.0
 */


package second;

import java.lang.Math;
import java.util.Scanner;


public class second_three {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Float a = scan.nextFloat();
		Float b = scan.nextFloat();
		scan.close();
		
		Double c = Math.sqrt(a*b);
		System.out.printf("Середнє геометричне у науковому %e та у десятковому %f представленнях.", c, c);		
	}
}
