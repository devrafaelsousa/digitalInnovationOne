package parte01.poo.java.javaDateManipulation.JavaDate;

import java.util.Date;

public class Exemplo3 {

    public static void main(String[] args) {
        Date dataNoPassado = new Date(1513124807691L);

        Date dataNoFuturo = new Date(16131212480769L);

        boolean isAfter = dataNoPassado.after(dataNoFuturo);
        System.out.println(isAfter);

        boolean isBefore = dataNoPassado.before(dataNoFuturo);
        System.out.println(isBefore);
    }
}
