package desafios.um;

// 1
public class Desafios {
    void exibeOlaMundo() {
        System.out.println("\nOlá Mundo!");
    }
}

// 2
class Calculadora {
    double dobraNumero(double numero) {
        return numero * 2;
    }
}

// 3
class Musica {
    String titulo;
    String nomeDoArtista;
    int anoDeLancamento;
    double avalicao;
    int numAvaliacoes;

    void avaliaMusica(double nota) {
        avalicao += nota;
        numAvaliacoes++;
    }
    double pegaMedia() {
        return avalicao / numAvaliacoes;
    }

    void exibeFicha() {
        System.out.printf("""
                \nTítulo da música: %s
                Nome do artista: %s
                Ano de lançamento: %d
                Média das avaliações: %.2f
                Número de avaliações: %d
                """, titulo, nomeDoArtista, anoDeLancamento, pegaMedia(),numAvaliacoes);
    }
}

// 4
class Carro {
    String modelo;
    int ano;
    String cor;

    void exibeFicha() {
        System.out.printf("""
                \nModelo do carro: %s
                Ano: %d
                Cor: %s
                """, modelo, ano, cor);
    }

    int calculaIdade(int anoAtual) {
        int idade = anoAtual - ano;
        System.out.println("Idade do carro: " + idade);
        return idade;
    }
}

// 5
class Aluno {
    String nome;
    int idade;

    void exibeAluno() {
        System.out.printf("""
                \nNome do aluno: %s
                Idade: %d
                """, nome, idade);
    }
}