package desafios.minhasmusicas.modelos;

public class MinhasFavoritas {
    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto!");
        } else {
            System.out.println(audio.getTitulo() + " é uma boa opção para ouvir!");
        }
    }
}
