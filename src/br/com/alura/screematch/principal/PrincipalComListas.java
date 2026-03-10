package br.com.alura.screematch.principal;

import br.com.alura.screematch.modelos.Filme;
import br.com.alura.screematch.modelos.Serie;
import br.com.alura.screematch.modelos.Titulo;

import java.util.ArrayList;

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
            System.out.println(item.getTitulo());
            if (item instanceof Filme filme) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }

        }
    }
}
