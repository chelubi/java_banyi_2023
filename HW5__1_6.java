/**
 * Бані, компмех, завдання 1.6, лаба 3
 * @author oleksandrbani
 * @version 1.0
 */


package HWs;

public class HW5__1_6 {
	    public static void main(String[] args) {
	        int[] numbers = {123, 4, 56, 7, 89, 10, 0, 3456};

	        int minDigits = Integer.MAX_VALUE;
	        for (int number : numbers) {
	            int digits = (int) Math.log10(number) + 1;
	            if (number == 0) {
	                digits = 1;
	            }
	            if (digits < minDigits) {
	                minDigits = digits;
	            }
	        }

	        System.out.println("result");
	        for (int number : numbers) {
	            int digits = (number == 0) ? 1 : (int) Math.log10(number) + 1;
	            if (digits == minDigits) {
	                System.out.println(number);
}
}
}
}

