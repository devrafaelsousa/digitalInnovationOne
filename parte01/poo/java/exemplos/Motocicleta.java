package parte01.poo.java.exemplos;

public class Motocicleta extends Veiculo {

    private String cilindradas;

    public String getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }

    public double calculaImposto() {
        return getValorVenal() * 0.03;
    }
}
