package one.digitalinnovation.classes.queue;

import java.util.Queue;
import java.util.LinkedList;

public class ExemploQueue{

    public static void main(String[] args){

        Queue <String> filaBanco = new LinkedList<>();

        filaBanco.add("Poseidon");
        filaBanco.add("Percy");
        filaBanco.add("Athena");
        filaBanco.add("Zeus");
        filaBanco.add("Hermes");

        System.out.println("\n");
        System.out.println(filaBanco);

        // EXIBINDO O PRIMEIRO ELEMENTO DA FILA:
        var cabecaLista = filaBanco.poll();
        System.out.println("\n");
        System.out.println(cabecaLista);
        System.out.println(filaBanco);

        // EXIBINDO O PRIMEIRO ELEMENTO DA FILA SEM REMOVÊ-LO:
        var cabecaLista2 = filaBanco.peek();
        System.out.println("\n");
        System.out.println(cabecaLista2);
        System.out.println(filaBanco);

        // VERIFICANDO SE A FILA ESTÁ VAZIA:
        filaBanco.element();
    }

}
