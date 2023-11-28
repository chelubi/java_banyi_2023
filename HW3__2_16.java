/**
 * Бані, компмех, завдання 2.16, лаба 2
 * @author oleksandrbani
 * @version 1.0
 */


package HWs;

import java.util.Scanner;

public class HW3__2_16 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("M: ");
        int M = scan.nextInt();
        System.out.print("N: ");
        int N = scan.nextInt();
        scan.close();

        int commonOnes = Integer.bitCount(M & N);

        int commonBits = Integer.bitCount((M ^ N) ^ (M | N));

        System.out.println("commom ones: " + commonOnes);
        System.out.println("common bits: " + commonBits);
    }
}

