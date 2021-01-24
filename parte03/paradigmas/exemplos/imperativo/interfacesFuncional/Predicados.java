package parte03.paradigmas.exemplos.imperativo.interfacesFuncional;

import java.util.function.Predicate;

public class Predicados {

    public static void main(String[] args) {

        Predicate<String> estaVazio = String::isEmpty;
        System.out.println(estaVazio.test(""));
        System.out.println(estaVazio.test("Tá cheio!!!"));
    }
}
