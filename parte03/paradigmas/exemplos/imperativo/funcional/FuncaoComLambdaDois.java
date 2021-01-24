package parte03.paradigmas.exemplos.imperativo.funcional;

public class FuncaoComLambdaDois {

    public static void main(String[] args) {
        FuncaoUm funcaoUm = valor -> {
            return valor;
        };
        System.out.println(funcaoUm.gerar("Rafael"));
    }

    @FunctionalInterface
    interface FuncaoUm {
        String gerar(String valor);
    }
}
