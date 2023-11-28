/**
 * Бані, компмех, завдання 3.7, лаба 2
 * @author oleksandrbani
 * @version 1.0
 */


package HWs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class HW4__3_7 {


	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Input date in format dd.mm.yyyy: ");
	        String str = scan.nextLine();

	        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.mm.yyyy");
	        try {
	            Date date = dateFormat.parse(str);
	            Calendar calendar = Calendar.getInstance();
	            calendar.setTime(date);
	            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

	            switch (dayOfWeek) {
	                case Calendar.MONDAY:
	                    System.out.println("monday");
	                    break;
	                case Calendar.TUESDAY:
	                    System.out.println("tuesday");
	                    break;
	                case Calendar.WEDNESDAY:
	                    System.out.println("wednesday");
	                    break;
	                case Calendar.THURSDAY:
	                    System.out.println("thursdy");
	                    break;
	                case Calendar.FRIDAY:
	                    System.out.println("friday");
	                    break;
	                case Calendar.SATURDAY:
	                    System.out.println("saturday");
	                    break;
	                case Calendar.SUNDAY:
	                    System.out.println("sunday");
	                    break;
	            }
	        } catch (ParseException e) {
	            System.out.println("Incorrect date format, use <dd.mm.yyyy>");
	            scan.close();
	        }
	    }
	}
