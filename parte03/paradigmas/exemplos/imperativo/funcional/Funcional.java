package parte03.paradigmas.exemplos.imperativo.funcional;

import java.util.function.UnaryOperator;

public class Funcional {

    public static void main(String[] args) {

        UnaryOperator<Integer> calculaValorVezesTres = valor -> valor * 3;

        int valor = 10;

        System.out.println("O resultado é :: " + calculaValorVezesTres);
    }
}
