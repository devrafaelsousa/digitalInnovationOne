package parte01.poo.java.exemplos.exercicio;

public class Supervisor extends Funcionario {

    @Override
    public double calculaImposto() {
        return super.calculaImposto() * 0.5;
    }
}
