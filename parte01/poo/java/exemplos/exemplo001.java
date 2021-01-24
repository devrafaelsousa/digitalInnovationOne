package parte01.poo.java.exemplos;

public class exemplo001 {
    public static void main(String[] args) {
        Pessoa eu = new Pessoa("Rafael", 28, 03, 1989);

        System.out.println(eu.getNome());
        System.out.println(eu.getDataNascimento());
        System.out.println(eu.calculaIdade());

        eu.setNome("Rafael Sousa");

        System.out.println(eu.getNome());
    }
}
