package parte01.poo.java.aulasExemploConstrutores.construtores.exercicio01;

public class ConstrutorCarro {

    public static void main(String[] args) {

        Carro carro = new Carro("Volkswagem", "Gol", "1999");

        System.out.println("Marca: " + carro.getMarca() + "\n"
                + "Modelo: " + carro.getModelo() + "\n"
                + "Ano: " + carro.getAno());
    }
}
