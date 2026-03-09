package desafios.minhasmusicas.principal;

import desafios.minhasmusicas.modelos.MinhasFavoritas;
import desafios.minhasmusicas.modelos.Musica;
import desafios.minhasmusicas.modelos.Podcast;

public class Principal {
    static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("La Mentira");
        musica.setArtista("Luis Miguel");

        for (int i = 0; i < 5000; i++) {
            musica.reproduz();
        }
        for (int i = 0; i < 350; i++) {
            musica.curte();
        }

        Podcast flow = new Podcast();
        flow.setTitulo("Flow Podcast");
        flow.setApresentador("Igor 3K");
        for (int i = 0; i < 2500; i++) {
            flow.reproduz();
        }
        for (int i = 0; i < 98; i++) {
            flow.curte();
        }

        MinhasFavoritas favoritas = new MinhasFavoritas();
        favoritas.inclui(musica);
        favoritas.inclui(flow);

    }
}
