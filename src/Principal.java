public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.titulo = "Scarface";
        meuFilme.anoDeLancamento = 1983;
        meuFilme.duracaoEmMinutos = 170;

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8.1);
        meuFilme.avalia(10);
        meuFilme.avalia(9.2);
        meuFilme.avalia(5.4);
        System.out.println(meuFilme.mediaDasAvaliacoes());
    }
}
