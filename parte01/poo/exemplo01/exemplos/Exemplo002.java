package parte01.poo.exemplo01.exemplos;


public class Exemplo002 {
    public static void main(String[] args) {

        Veiculo generico = new Veiculo();
        generico.setValorVenal(1000.0);
        System.out.println(generico.calculaImposto());

        Veiculo carro = new Veiculo();
        carro.setValorVenal(7000.0);
        System.out.println(carro.calculaImposto());

        Veiculo moto = new Veiculo();
        moto.setValorVenal(3000.0);
        System.out.println(moto.calculaImposto());
    }
}

