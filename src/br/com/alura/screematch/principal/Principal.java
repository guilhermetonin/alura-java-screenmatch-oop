package br.com.alura.screematch.principal;

import br.com.alura.screematch.calculo.CalculadoraDeTempo;
import br.com.alura.screematch.calculo.FiltroRecomendacao;
import br.com.alura.screematch.modelo.Episodio;
import br.com.alura.screematch.modelo.Filme;
import br.com.alura.screematch.modelo.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        // instância filme scarface
        Filme scarface = new Filme("Scarface", 1983);
        scarface.setDuracaoEmMinutos(120);

        // instância filme avatar
        Filme avatar = new Filme("Avatar", 2009);
        avatar.setDuracaoEmMinutos(180);

        // instância serie flash
        Serie flash = new Serie("The Flash", 2000);
        flash.setTemporadas(5);
        flash.setEpisodiosPorTemporadas(10);
        flash.setMinutosPorEpisodio(40);
        System.out.println("Duração da Série: " + flash.getDuracaoEmMinutos());

        // calculadora de tempo total
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(scarface);
        calculadora.inclui(avatar);
        calculadora.inclui(flash);
        System.out.println("Calculadora - Duração Total: " + calculadora.getTempoTotal());

        // filtragem de classificação
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(scarface);

        // instância de um episodio de flash
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie("The Flash");
        episodio.setTotalVisualizacoes(400);
        filtro.filtra(episodio);

        // instância filme interstellar
        var interstellar = new Filme("Interstellar", 2014);
        interstellar.setDuracaoEmMinutos(170);
        interstellar.avaliaFilme(10);

        // ArrayList
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(interstellar);
        listaDeFilmes.add(scarface);
        listaDeFilmes.add(avatar);

        System.out.println("\nTamanho da Lista: " + listaDeFilmes.size());
        System.out.println("Primeiro Elemento: " + listaDeFilmes.get(0).getNome());
        System.out.println("Todos os Filmes: " + listaDeFilmes);
        System.out.println("toString do Filme: " + listaDeFilmes.get(0).toString());
    }
}
