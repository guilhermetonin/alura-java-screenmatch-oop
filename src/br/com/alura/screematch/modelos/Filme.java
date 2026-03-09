package br.com.alura.screematch.modelos;

import br.com.alura.screematch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) calculaMedia() / 2;
    }

    @Override
    public String toString() {
        return String.format("Filme: %s (%d)", this.getTitulo(), this.getAnoDeLancamento());
    }
}