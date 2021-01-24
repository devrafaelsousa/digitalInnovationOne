package parte01.poo.java.javaDateManipulation.javaCalendar;

import java.util.Calendar;

public class Exemplo7 {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();
        System.out.println("A data corrente é: " + agora.getTime());
        // Output: A data corrente é: Mon Jan 18 16:30:45 BRT 2021

        agora.add(Calendar.DATE, -15);
        System.out.println("15 dias atrás: " + agora.getTime());
        // Output: 15 dias atrás: Sun Jan 03 16:30:45 BRT 2021

        agora.add(Calendar.MONTH, 4);
        System.out.println("4 meses depois: " + agora.getTime());
        // Output: 4 meses depois: Mon May 03 16:30:45 BRT 2021

        agora.add(Calendar.YEAR, 2);
        System.out.println("2 anos depois: " + agora.getTime());
        // Output: 2 anos depois: Wed May 03 16:30:45 BRT 2023
    }
}
