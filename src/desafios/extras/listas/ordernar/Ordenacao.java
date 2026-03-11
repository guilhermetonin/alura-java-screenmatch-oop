package desafios.extras.listas.ordernar;

import java.util.ArrayList;
import java.util.Collections;

public class Ordenacao {
    static void main(String[] args) {

        ArrayList<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(11);
        listaNumeros.add(25);
        listaNumeros.add(31);
        listaNumeros.add(2);
        listaNumeros.add(5);
        System.out.println("Lista sem ordenação: " + listaNumeros);

        Collections.sort(listaNumeros);

        System.out.println("Lista ordenada: " + listaNumeros);

    }
}
