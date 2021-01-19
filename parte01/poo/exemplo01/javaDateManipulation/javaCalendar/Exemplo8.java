package parte01.poo.exemplo01.javaDateManipulation.javaCalendar;

import java.util.Calendar;

public class Exemplo8 {

    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();

        System.out.printf("%tc\n", agora);
        // Output: seg jan 18 16:47:21 BRT 2021

        System.out.printf("%tF\n", agora);
        // Output: 2021-01-18

        System.out.printf("%tD\n", agora);
        // Output: 01/18/21

        System.out.printf("%tr\n", agora);
        // Output: 04:47:21 PM

        System.out.printf("%tT\n", agora);
        // Output: 16:47:21
    }
}
