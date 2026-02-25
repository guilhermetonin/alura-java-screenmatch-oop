public class Filme {
    String titulo;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes = 0;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica() {
        System.out.printf("""
                Título do filme: %s
                Ano de lançamento: %d
                Duração em minutos: %d
                Soma das avaliações: %f
                Total de avaliações: %d
                Incluíso no plano: %b
                """, titulo, anoDeLancamento, duracaoEmMinutos, somaDasAvaliacoes, totalDeAvaliacoes, incluidoNoPlano);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    String mediaDasAvaliacoes() {
        return String.format("Média das avaliações: %.2f", (somaDasAvaliacoes / totalDeAvaliacoes));
    }
}