/**
 * Бані, компмех, завдання 4.3, лаба 2
 * @author oleksandrbani
 * @version 1.0
 */


package HWs;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class HW4__4_3 {
    public static void main(String[] args) {
        int saturdays = 0;
        int sundays = 0;

        for (int year = 1; year <= 400; year++) {
            Calendar calendar = new GregorianCalendar(year, Calendar.JANUARY, 1);
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

            if (dayOfWeek == Calendar.SATURDAY) {
                saturdays++;
            } else if (dayOfWeek == Calendar.SUNDAY) {
                sundays++;
            }
        }

        System.out.println("1 січня випадає на суботу: " + saturdays + " разів у 400 років."); //res = 58, estimate = 56 (?)
        System.out.println("1 січня випадає на неділю: " + sundays + " разів у 400 років."); //res = 58
    }
}
