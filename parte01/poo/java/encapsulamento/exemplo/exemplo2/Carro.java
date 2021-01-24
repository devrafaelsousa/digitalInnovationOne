package parte01.poo.java.encapsulamento.exemplo.exemplo2;

import parte01.poo.java.encapsulamento.exemplo.exemplo1.Veiculo;

public class Carro extends Veiculo {

    public Carro(String modelo, String marca, double valorVenal) {
        super(modelo, marca, valorVenal);
        this.quantidadeDePortas = quantidadeDePortas;
    }

    private int quantidadeDePortas;

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    public void setQuantidadeDePortas(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public double calculaImposto() {
        return getValorVenal() * 0.07;
    }
}