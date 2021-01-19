package parte01.poo.exemplo01.javaDateManipulation.javaCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exemplo10 {

    public static void main(String[] args) {

        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:mm");

        String dataFormatada = formatter.format(agora);

        System.out.println(dataFormatada);
        // Output: 18/01/2021 17:27:38:27
    }
}
