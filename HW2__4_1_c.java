/**
 * Бані, компмех, завдання 4.1.в, лаба 1
 * @author oleksandrbani
 * @version 1.0
 */


package HWs;

import java.util.Scanner;

public class HW2__4_1_c {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter x: ");
        double x = scan.nextDouble();
        scan.close();
        
        //Схема Горнера
        double y = ((((x + 5) * x + 10) * x + 10) * x + 5) * x + 1;
        System.out.println("answer: " + y);
    }
}

