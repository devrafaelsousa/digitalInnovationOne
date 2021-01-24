package parte03.paradigmas.exemplos.imperativo.interfacesFuncional;

import java.util.function.Supplier;

public class Supridores {

    public static void main(String[] args) {

        Supplier<Pessoa> instanciaPessoa = Pessoa::new;
        System.out.println(instanciaPessoa.get());
    }
}

class Pessoa {
    private final String nome;
    private final Integer idade;

    public Pessoa() {
        nome = "Rafael";
        idade = 31;
    }
    @Override
    public String toString() {
        return  String.format("Nome : %s, Idade : %d", nome, idade);
    }
}
