package parte01.poo.exemplo01.exemplos.exercicio;

public class Programa {

    public static void main(String[] args) {

        Funcionario atendente = new Atendente();
        atendente.setSalario(2000.0);
        System.out.println(atendente.calculaImposto());

        Funcionario gerente = new Gerente();
        gerente.setSalario(9000.0);
        System.out.println(gerente.calculaImposto());

        Funcionario supervisor = new Supervisor();
        supervisor.setSalario(1200.0);
        System.out.println(supervisor.calculaImposto());
    }
}
