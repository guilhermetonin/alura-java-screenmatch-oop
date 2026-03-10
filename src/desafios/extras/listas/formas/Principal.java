package desafios.extras.listas.formas;

import desafios.extras.listas.formas.modelos.Circulo;
import desafios.extras.listas.formas.modelos.Forma;
import desafios.extras.listas.formas.modelos.Quadrado;

import java.util.ArrayList;

public class Principal {
    static void main(String[] args) {

        // instância quadrado
        Quadrado q1 = new Quadrado(5);
        Quadrado q2 = new Quadrado(10);

        // instância circulo
        Circulo c1 = new Circulo(8);
        Circulo c2 = new Circulo(4);

        // cria uma lista
        ArrayList<Forma> listaDeFormas = new ArrayList<>();
        listaDeFormas.add(q1);
        listaDeFormas.add(q2);
        listaDeFormas.add(c1);
        listaDeFormas.add(c2);

        double maiorArea = q1.calcularArea();

        // percorre todos os elementos dentro da lista de formas
        for (Forma forma: listaDeFormas) {
            // encontra a maior area
            if (forma.calcularArea() > maiorArea) {
                maiorArea = forma.calcularArea();
            }
            // calcula a area das formas
            if (forma instanceof Quadrado) {
                // %n pula linha no java
                System.out.printf("Área do Quadrado: %.2f %n", forma.calcularArea());
            } else {
                System.out.printf("Área do Círculo: %.2f %n", forma.calcularArea());
            }
        }
        System.out.printf("Maior área encontrada: %.2f", maiorArea);
    }
}
