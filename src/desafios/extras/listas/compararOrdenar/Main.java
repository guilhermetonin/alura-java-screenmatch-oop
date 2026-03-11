package desafios.extras.listas.compararOrdenar;

import desafios.extras.listas.compararOrdenar.modelo.Titulo;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static void main(String[] args) {

        // cria instâncias de Titulo
        Titulo titulo1 = new Titulo("Dive");
        Titulo titulo2 = new Titulo("Index");
        Titulo titulo3 = new Titulo("Byte");
        Titulo titulo4 = new Titulo("Cache");

        // cria uma lista de títulos
        ArrayList<Titulo> listaTitulos = new ArrayList<Titulo>();
        listaTitulos.add(titulo1);
        listaTitulos.add(titulo2);
        listaTitulos.add(titulo3);
        listaTitulos.add(titulo4);
        System.out.println("Sem ordenar: " + listaTitulos);

        // ordena a lista completa
        Collections.sort(listaTitulos);
        System.out.println("Ordenado: " + listaTitulos);

    }
}
