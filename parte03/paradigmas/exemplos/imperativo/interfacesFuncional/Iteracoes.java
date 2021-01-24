package parte03.paradigmas.exemplos.imperativo.interfacesFuncional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {

    public static void main(String[] args) {
        String[] nomes = { "Rafael", "Sousa", "Programador", "Java"};
        Integer[] numeros = {1, 2, 3, 4};
//        imprimeNomesFiltrados(nomes);
//        imprimeTodosOsNomes(nomes);
//        imprimirDobroDeCadaItemDaLista(numeros);

        List<String> profissoes = new ArrayList<>();

        profissoes.add("Desenvolvedor Java");
        profissoes.add("Analista QA");
        profissoes.add("Desenvolvedor Python");
        profissoes.add("Cientista de Dados");
        profissoes.add("Desenvolvedor Frontend");
        profissoes.add("Engenheiro DevOps");
        profissoes.add("Desenvolvedor Backend");
        profissoes.add("Desenvolvedor Full Stack");
        profissoes.add("Engenheiro de Software");


        profissoes.stream()
                .filter(profisao -> profisao.startsWith("Desenvolvedor"))
                .forEach(System.out::println);


    }

    private static void imprimeTodosOsNomes(String[] nomes) {
        for (String nome : nomes) {
            System.out.println("for --> " + nome);
        }

        Stream.of(nomes)
                .forEach(nome -> System.out.println("forEach ----> " + nome));
    }

    public static void imprimeNomesFiltrados(String... nomes) {

        String nomesParaImprimirDaString = Stream.of(nomes)
                .filter(nome -> nome.equals("Rafael"))
                .collect(Collectors.joining());
        System.out.println("Nome no Stream : " + nomesParaImprimirDaString);
    }

    public static void imprimirDobroDeCadaItemDaLista(Integer... numeros){
        for (Integer numero : numeros) {
            System.out.println("for --> " + numero * 2);
        }

        Stream.of(numeros)
                .map(numero -> numero * 2)
                .forEach(numero -> System.out.println("forEach ----> " + numero));

    }
}
