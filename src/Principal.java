import br.com.alura.screematch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        // cria uma nota instância de um Filme
        Filme meuFilme = new Filme();
        meuFilme.setTitulo("Scarface");
        meuFilme.setAnoDeLancamento(1983);
        meuFilme.setDuracaoEmMinutos(170);

        // exibe a ficha
        meuFilme.exibeFichaTecnica();

        // adiciona notas de avaliações
        meuFilme.avaliaFilme(8.1);
        meuFilme.avaliaFilme(10);
        meuFilme.avaliaFilme(9.2);
        meuFilme.avaliaFilme(5.4);
        // exibe a média dessas notas
        System.out.println(meuFilme.calculaMedia());

        // exibe uma variável privada
        System.out.println("total: " + meuFilme.getTotalDeAvaliacoes());
    }
}
