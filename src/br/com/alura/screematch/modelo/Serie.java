package br.com.alura.screematch.modelo;

public class Serie extends Titulo {
    private int temporadas;
    private int episodiosPorTemporadas;
    private int minutosPorEpisodio;
    private boolean ativa = false;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    // getters
    public int getTemporadas() {
        return temporadas;
    }

    public int getEpisodiosPorTemporadas() {
        return episodiosPorTemporadas;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public boolean isAtiva() {
        return ativa;
    }

    // setters
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setEpisodiosPorTemporadas(int episodiosPorTemporadas) {
        this.episodiosPorTemporadas = episodiosPorTemporadas;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public void setAtiva() {
        this.ativa = !this.ativa;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporadas * minutosPorEpisodio;
    }

    @Deprecated
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {}

    @Override
    public String toString() {
        return String.format("Série: %s (%d)", this.getNome(), this.getAnoDeLancamento());
    }
}
