package parte03.paradigmas.exemplos.imperativo.funcional;

public class FuncaoComLambda {

    public static void main(String[] args) {
        Funcao colocarPrefixoSenhorNaString = valor -> "Sr. " + valor;
        System.out.println(colocarPrefixoSenhorNaString.gerar("João"));
    }

    interface Funcao {
        String gerar(String valor);
    }
}
