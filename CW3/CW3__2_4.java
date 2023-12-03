/**
 * Бані, компмех, завдання 2.4, лаба 2
 * @author oleksandrbani
 * @version 1.0
 */


package CWs.CW3;

import java.util.Scanner;

public class CW3__2_4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter n, m: ");
        int n = scan.nextInt();
        int m = scan.nextInt();
        scan.close();

        int mask = 1 << m;
        int res = n ^ mask;
        System.out.println("new number: " + res);

    }
}
