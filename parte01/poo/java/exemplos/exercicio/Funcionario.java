package parte01.poo.java.exemplos.exercicio;

public class Funcionario {

    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calculaImposto() {
        return this.getSalario();
    }
}
