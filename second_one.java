/**
 * Бані, компмех, завдання 2.1 - введення з консолі
 * @author oleksandrbani
 * @version 1.0
 */

package second;

import java.util.Scanner;  

public class second_one {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Введіть прізвище"); 
		String name = in.nextLine();
		System.out.printf("Привіт, %s", name);
		in.close();
	}
}