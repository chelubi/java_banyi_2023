/**
 * Бані, компмех, завдання 1.20, лаба 3
 * @author oleksandrbani
 * @version 1.0
 */


package HWs;

public class ISBN {
	public static void main(String[] args) {

    if (args.length != 1 || args[0].length() != 9) {
        System.out.println("wrong, try again");
        return;
    }

    String isbn = args[0];
    int sum = 0;

    for (int i = 0; i < 9; i++) {
        int digit = Character.getNumericValue(isbn.charAt(i));
        sum += digit * (10 - i);
    }

    String checksum;
    if (sum % 11 == 1) {
        checksum = "X";
    } else if (sum % 11 == 0) {
        checksum = "0";
    } else {
        checksum = Integer.toString(11 - (sum % 11));
    }

    System.out.println("Повний ISBN: " + isbn + checksum);
}
}

