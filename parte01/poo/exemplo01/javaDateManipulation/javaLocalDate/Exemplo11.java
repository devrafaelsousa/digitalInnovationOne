package parte01.poo.exemplo01.javaDateManipulation.javaLocalDate;

import java.time.LocalDate;

public class Exemplo11 {

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate ontem = hoje.minusDays(1);
        System.out.println(ontem);
    }
}
