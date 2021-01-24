package parte01.poo.java.javaDateManipulation.JavaDate;

import java.util.Date;

public class Exemplo4 {
    public static void main(String[] args) {
        Date dataNoPassado = new Date(15131224807691L);

        Date dataNoFuturo = new Date(16131224807691L);

        Date mesmaDataNoFuturo = new Date(16131224807691L);

        boolean isEquals = dataNoFuturo.equals(dataNoFuturo);
        System.out.println(isEquals);

        int compareCase1 = dataNoPassado.compareTo(dataNoFuturo);

        int compareCase2 = dataNoFuturo.compareTo(dataNoPassado);

        int compareCase3 = dataNoFuturo.compareTo(mesmaDataNoFuturo);

        System.out.println(compareCase1);
        System.out.println(compareCase2);
        System.out.println(compareCase3);
    }
}
