package parte02.collections.javaCollections.collections.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {

    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Pátricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávia");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        String clienteASerAtendido = filaBanco.poll();

        System.out.println(clienteASerAtendido);

        System.out.println(filaBanco);

        String primeiroCliente = filaBanco.peek();

       System.out.println(primeiroCliente);

        System.out.println(filaBanco);

        // filaBanco.clear();

        String primeiroClienteOuErro = filaBanco.element();

        System.out.println(primeiroClienteOuErro);

        for (String cliente: filaBanco) {
            System.out.println("--> " + cliente);
        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();

        while (iteratorFilaBanco.hasNext()) {
            System.out.println("----> " + iteratorFilaBanco.next());
        }

        System.out.println(filaBanco.size());

        System.out.println(filaBanco.isEmpty());

    }
}
