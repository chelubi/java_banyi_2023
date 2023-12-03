/**
 * Бані, компмех, завдання 1.2, лаба 2
 * @author oleksandrbani
 * @version 1.0
 */


package CWs.CW3;
import java.util.Scanner;

public class CW3__1_2 {
    public static void main(String[] args) {

        String s1, s2;
        Scanner scan = new Scanner(System.in);
        s1 = scan.next();
        s2 = scan.next();

        if (s1.equals(s2)){
            System.out.printf("Equal\n");
        } else {
            System.out.printf("Non equal\n");
        }
        scan.close();
    }
}
