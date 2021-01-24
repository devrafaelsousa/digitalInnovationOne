package parte01.poo.java.exemplos.exercicio;

public class Atendente extends Funcionario {

    @Override
    public double calculaImposto() {
        return super.calculaImposto() * 0.01;
    }
}
