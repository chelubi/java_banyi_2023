/**
 * Бані, компмех, завдання 2.1, лаба 2
 * @author oleksandrbani
 * @version 1.0
 */


package CWs.CW3;

public class CW3__2_1 {
    public static void main(String[] args) {
    	 // перше число з нулем у найменш значущій цифрі
        int a = 0xD0;
         // друге число з одиницею у найменш значущій цифрі
        int b = 0xA1; 
        System.out.println("a: " + a + ", b: " + b);

        int res_1 = a & b;
        int res_2 = a | b;
        int res_3 = a ^ b;
        int res_4 = ~a;
        int res_5 = a >> b;
        int res_6 = a << b;
        int res_7 = a >>> b;
        System.out.println("res of AND: " + Integer.toBinaryString(res_1));
        System.out.println("res of OR: "  + Integer.toBinaryString(res_2));
        System.out.println("res of XOR: " + Integer.toBinaryString(res_3));
        System.out.println("res of complementation: " + Integer.toBinaryString(res_4));
        System.out.println("res of >>:  " + Integer.toBinaryString(res_5));
        System.out.println("res of <<:  " + Integer.toBinaryString(res_6));
        System.out.println("res of >>>: " + Integer.toBinaryString(res_7));

    }
}
