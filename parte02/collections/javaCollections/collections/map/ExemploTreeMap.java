package parte02.collections.javaCollections.collections.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {

    public static void main(String[] args) {

        TreeMap<String, String> treeCapitais = new TreeMap<>();

        // Monta a árvore com as capitais
        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("SC", "Florianópolis");
        treeCapitais.put("PR", "Curitiba");
        treeCapitais.put("SP", "São Paulo");
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("MG", "Belo Horizonte");

        System.out.println(treeCapitais);

        // Retorna a primeira capital no topo da árvore
        System.out.println(treeCapitais.firstKey());

        // Retorna a última capital no final da árvore
        System.out.println(treeCapitais.lastKey());

        // Retorna a primeira capital abaixo na árvore de capital parametrizada
        System.out.println(treeCapitais.lowerKey("SC"));

        // Retorna a primeira capital acima na árvore de capital parametrizada
        System.out.println(treeCapitais.higherKey("SC"));

        // Exibe todas as capitais no console
        System.out.println(treeCapitais);

        // Retorna Retorna a primeira capital no topo da árvore
        System.out.println(treeCapitais.firstEntry().getKey() + "-" + treeCapitais.firstEntry().getValue());

        // Retorna a última capital no final da árvore
        System.out.println(treeCapitais.firstEntry().getKey() + "-" + treeCapitais.lastEntry().getValue());

        // Retorna a primeira capital abaixo na árvore de capital parametrizada
        System.out.println(treeCapitais.lowerEntry("SC").getKey() + "-" + treeCapitais.lowerEntry("SC").getValue());

        // Retorna a primeira capital abaixo na árvore de capital parametrizada
        System.out.println(treeCapitais.higherEntry("SC").getKey() + "-" + treeCapitais.higherEntry("SC").getValue());

        // Exibe todas as capitais no console
        System.out.println(treeCapitais);

        Map.Entry<String, String> firsEntry = treeCapitais.pollFirstEntry();
        Map.Entry<String, String> lastEntry = treeCapitais.pollLastEntry();

        // Retorna a primeira capital do topo da árvore, removendo do map
        System.out.println(firsEntry.getKey() + " - " + lastEntry.getValue());

        // Retorna a primeira capital do final da árvore, removendo do map
        System.out.println(lastEntry.getKey() + " - " + firsEntry.getValue());

        // Exibe todas as capitais no console
        System.out.println(treeCapitais);

        Iterator<String> iterator = treeCapitais.keySet().iterator();

        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + " - "  + treeCapitais.get(key));
        }

        for (String capital: treeCapitais.keySet()) {
            System.out.println(capital + " - " + treeCapitais.get(capital));
        }

        for (Map.Entry<String, String> capital: treeCapitais.entrySet()) {
            System.out.println(capital + " - " + treeCapitais.get(capital));
        }
    }
}
