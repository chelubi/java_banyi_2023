/**
 * Бані, компмех, завдання 2.2, лаба 2
 * @author oleksandrbani
 * @version 1.0
 */


package CWs.CW3;

public class CW3__2_2 {
    public static void main(String[] args) {
    	
    	 // має найбільш значущу двійкову позицію
    	
        int a = 0x7FFFFFFF;
        System.out.println("decimal a: " + a + ", binary a: " + Integer.toBinaryString(a));
        while (a != 0){
            a = a >> 1;
            System.out.println("a: " + Integer.toBinaryString(a));
        }

        int b = 0b11011011; 
        System.out.println("decimal b: " + b + ", binary b: " + Integer.toBinaryString(b));
        b = b << 24;
        System.out.println("After <<, decimal b: " + b + ", binary b: " + Integer.toBinaryString(b));
        while (b != 0){
            b = b >>> 1;
            System.out.println("b: " + Integer.toBinaryString(b));
        }

    }
}
