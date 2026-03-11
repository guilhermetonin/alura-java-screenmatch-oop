package desafios.extras.listas.alternandoList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        System.out.println("ArrayList: " + lista);

        // converte para LinkedList e vira uma nova lista vazia
        lista = new LinkedList<>();
        lista.add("C++");
        lista.add("C#");
        System.out.println("LinkedList: " + lista);
    }
}
