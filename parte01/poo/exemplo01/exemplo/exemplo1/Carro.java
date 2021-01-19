package parte01.poo.exemplo01.exemplo.exemplo1;

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
