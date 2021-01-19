package parte01.poo.exemplo01.javaDateManipulation.javaCalendar;

import java.text.DateFormat;
import java.util.Date;

public class Exemplo9 {

    public static void main(String[] args) {
        Date agora = new Date();

        String dateToStr = DateFormat.getInstance().format(agora);
        System.out.println(dateToStr);
        // Output: 18/01/2021 17:10

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(agora);
        System.out.println(dateToStr);
        // Output: 18 de janeiro de 2021 17:10

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(agora);
        System.out.println(dateToStr);
        // Output: 18 de janeiro de 2021 17:13:13 BRT
    }
}
