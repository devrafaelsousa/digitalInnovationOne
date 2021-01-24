package parte01.poo.java.encapsulamento.exemplo.exemplo001;

public class Exemplo001 {
    public static void main(String[] args) {

        Carro carro =  new Carro();
        carro.setMarca("Nissan");
        carro.setModelo("March");
        carro.setQuantidadeDePortas(4);
        // ação
        carro.acelera();

        Motocicleta moto = new Motocicleta();
        moto.setMarca("DUCATI");
        moto.setModelo("STREETFIGHTER");
        moto.setCilindradas("850");
        // ação
        moto.acelera();
    }
}
