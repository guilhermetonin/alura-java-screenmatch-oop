package br.com.alura.screematch.modelos;

public class Titulo {
    private String titulo;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes = 0;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    // getters
    public String getTitulo() {
        return titulo;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    // setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica() {
        System.out.printf("""
                Título: %s
                Ano de lançamento: %d
                Duração em minutos: %d
                Soma das avaliações: %f
                Total de avaliações: %d
                Incluíso no plano: %b
                """, titulo, anoDeLancamento, duracaoEmMinutos, somaDasAvaliacoes, totalDeAvaliacoes, incluidoNoPlano);
    }

    public void avaliaFilme(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public String calculaMedia() {
        return String.format("Média das avaliações: %.2f", (somaDasAvaliacoes / totalDeAvaliacoes));
    }

}
