package desafios.um;

public class Main {
    public static void main(String[] args) {
        // 1
        Desafios p1 = new Desafios();
        p1.exibeOlaMundo();

        // 2
        Calculadora n1 = new Calculadora();
        double numeroDobrado = n1.dobraNumero(12);
        System.out.println(numeroDobrado);

        // 3
        Musica m1 = new Musica();
        m1.titulo = "La Mentira";
        m1.nomeDoArtista = "Luis Miguel";
        m1.anoDeLancamento = 1991;
        m1.avaliaMusica(10);
        m1.avaliaMusica(9);
        m1.avaliaMusica(8.8);
        m1.exibeFicha();

        // 4
        Carro c1 = new Carro();
        c1.modelo = "Onix";
        c1.ano = 2021;
        c1.cor = "Preto";
        c1.exibeFicha();
        c1.calculaIdade(2026);

        // 5
        Aluno a1 = new Aluno();
        a1.nome = "Gui";
        a1.idade = 19;
        a1.exibeAluno();
    }
}
