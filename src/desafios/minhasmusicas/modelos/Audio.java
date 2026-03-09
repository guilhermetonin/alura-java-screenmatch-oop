package desafios.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private double duracao;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;

    public void reproduz() {
        this.totalReproducoes++;
    }

    public void curte() {
        this.totalCurtidas++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }
}
