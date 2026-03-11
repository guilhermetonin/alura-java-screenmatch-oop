package br.com.alura.screematch.principal;

import br.com.alura.screematch.modelo.Filme;
import br.com.alura.screematch.modelo.Serie;
import br.com.alura.screematch.modelo.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    static void main(String[] args) {

        // instância filme scarface
        var scarface = new Filme("Scarface", 1983);
        scarface.avaliaFilme(9);

        // instância filme avatar
        var avatar = new Filme("Avatar", 2009);
        avatar.avaliaFilme(5);

        // instância filme interstellar
        var interstellar = new Filme("Interstellar", 2014);
        interstellar.avaliaFilme(10);

        // instância serie theflash
        var flash = new Serie("The Flash", 2014);

        // ArrayList
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(interstellar);
        lista.add(scarface);
        lista.add(avatar);
        lista.add(flash);

        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }

        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Will Smith");
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Robert Downey Jr");
        System.out.println("\nArtistas (desordenado): " + buscaPorArtista);

        // depois da ordenar
        Collections.sort(buscaPorArtista);
        System.out.println("Artistas (ordenado): " + buscaPorArtista);

        System.out.println("\nLista de filmes ordenados (Alfabética):");
        Collections.sort(lista);
        System.out.println(lista);

        System.out.println("\nLista de filmes ordenados (Data de Lançamento):");
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);
    }
}
