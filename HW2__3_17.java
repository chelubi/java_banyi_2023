/**
 * Бані, компмех, завдання 3.17, лаба 1
 * @author oleksandrbani
 * @version 1.0
 */


package HWs;

import java.util.Scanner;

public class HW2__3_17 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String processedInput = input.replaceAll("[*\\s]", "");

        double number;
        try {
            number = Double.parseDouble(processedInput);
        } catch (NumberFormatException e) {
            System.out.println("Error");
            scan.close();
            return;
        }

        double kub = Math.pow(number, 3);
        System.out.println("Result: " + kub);
        scan.close();
    }
}

