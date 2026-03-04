import br.com.alura.screematch.calculos.CalculadoraDeTempo;
import br.com.alura.screematch.calculos.FiltroRecomendacao;
import br.com.alura.screematch.modelos.Episodio;
import br.com.alura.screematch.modelos.Filme;
import br.com.alura.screematch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        // instâncias Filme
        Filme scarface = new Filme();
        scarface.setDuracaoEmMinutos(120);

        Filme avatar = new Filme();
        avatar.setDuracaoEmMinutos(180);

        // instância Serie
        Serie lost = new Serie();
        lost.setTitulo("THE LOST");
        lost.setTemporadas(5);
        lost.setEpisodiosPorTemporadas(10);
        lost.setMinutosPorEpisodio(40);
        System.out.println("duração serie: " + lost.getDuracaoEmMinutos());

        // calculadora de tempo total
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(scarface);
        calculadora.inclui(avatar);
        calculadora.inclui(lost);
        System.out.println("calculadora - duração total: " + calculadora.getTempoTotal());

        // filtragem de classificação
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(scarface);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie("THE LOST");
        episodio.setTotalVisualizacoes(400);
        filtro.filtra(episodio);

    }
}
