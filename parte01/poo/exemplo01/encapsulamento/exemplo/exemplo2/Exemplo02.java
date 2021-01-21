package parte01.poo.exemplo01.encapsulamento.exemplo.exemplo2;

import parte01.poo.exemplo01.encapsulamento.exemplo.exemplo1.Carro;
import parte01.poo.exemplo01.encapsulamento.exemplo.exemplo1.Veiculo;

public class Exemplo02 {

    public static void main(String[] args) {
        parte01.poo.exemplo01.encapsulamento.exemplo.exemplo1.Veiculo carro1 = new Carro( "Palio", "Fiat", 20000.0);
        Veiculo carro2 = new Carro("Palio", "Fiat", 20000.0);

        System.out.println(carro1.equals(carro2));
    }
}
