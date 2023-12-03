/**
 * Бані, компмех, завдання 2.3, лаба 2
 * @author oleksandrbani
 * @version 1.0
 */

package CWs.CW3;

import java.util.Scanner;

public class CW3__2_3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("enter a character: ");
        char ch = scan.next().charAt(0);

        System.out.println("binary is: " + char_to_bin(ch));

       scan.close();

    }

    public static String char_to_bin(char b){

        String s = "";
        for (int i = 15; i >= 0; i--) {

            boolean bvalue = ((b >> i) & 1) == 1;
            s += (bvalue ? '1' : '0');

        }
        return s;

    }
}
