package br.com.alura.screematch.calculo;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os melhores do momento.");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Está bem avaliado no momento.");
        } else {
            System.out.println("Coloque na lista para assistir depois.");
        }
    }

}
