package parte03.paradigmas.exemplos.imperativo.interfacesFuncional;

import java.util.function.Function;

public class Funcoes {

    public static void main(String[] args) {

        Function<String, String> retornaNomeAoContrario = texto
                -> new StringBuilder(texto).reverse().toString();
        Function<String, Integer> converteStringEmInteiro = string
                -> Integer.parseInt(string) * 2;
        System.out.println(retornaNomeAoContrario.apply("Rafael"));
        System.out.println(converteStringEmInteiro.apply("20"));
    }
}
