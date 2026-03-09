import br.com.alura.screematch.calculos.CalculadoraDeTempo;
import br.com.alura.screematch.calculos.FiltroRecomendacao;
import br.com.alura.screematch.modelos.Episodio;
import br.com.alura.screematch.modelos.Filme;
import br.com.alura.screematch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        // instância filme scarface
        Filme scarface = new Filme();
        scarface.setTitulo("Scarface");
        scarface.setAnoDeLancamento(1983);
        scarface.setDuracaoEmMinutos(120);

        // instância filme avatar
        Filme avatar = new Filme();
        avatar.setTitulo("Avatar");
        avatar.setAnoDeLancamento(2009);
        avatar.setDuracaoEmMinutos(180);

        // instância serie lost
        Serie lost = new Serie();
        lost.setTitulo("THE LOST");
        lost.setTemporadas(5);
        lost.setEpisodiosPorTemporadas(10);
        lost.setMinutosPorEpisodio(40);
        System.out.println("Duração da Série: " + lost.getDuracaoEmMinutos());

        // calculadora de tempo total
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(scarface);
        calculadora.inclui(avatar);
        calculadora.inclui(lost);
        System.out.println("Calculadora - Duração Total: " + calculadora.getTempoTotal());

        // filtragem de classificação
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(scarface);

        // instância de um episodio de lost
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie("THE LOST");
        episodio.setTotalVisualizacoes(400);
        filtro.filtra(episodio);

        // instância filme interstellar
        var interstellar = new Filme();
        interstellar.setTitulo("Interstellar");
        interstellar.setAnoDeLancamento(2014);
        interstellar.setDuracaoEmMinutos(170);
        interstellar.avaliaFilme(10);

        // ArrayList
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(interstellar);
        listaDeFilmes.add(scarface);
        listaDeFilmes.add(avatar);

        // exibe na tela
        System.out.println("\nTamanho da Lista: " + listaDeFilmes.size());
        System.out.println("Primeiro Filme: " + listaDeFilmes.get(0).getTitulo());
        System.out.println("Todos os Filmes: " + listaDeFilmes);


    }
}
