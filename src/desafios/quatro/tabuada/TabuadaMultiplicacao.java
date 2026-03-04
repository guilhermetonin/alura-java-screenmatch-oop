package desafios.quatro.tabuada;

public class TabuadaMultiplicacao implements Tabuada {
    @Override
    public void mostrarTabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d \n", numero, i, (numero * i));
        }
    }
}
