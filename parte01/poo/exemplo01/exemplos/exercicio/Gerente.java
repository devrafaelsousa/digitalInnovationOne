package parte01.poo.exemplo01.exemplos.exercicio;

public class Gerente extends Funcionario {

    @Override
    public double calculaImposto() {
        return super.calculaImposto() * 0.01;
    }
}
