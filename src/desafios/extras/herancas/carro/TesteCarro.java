package desafios.extras.herancas.carro;

public class TesteCarro {
    static void main(String[] args) {

        // subclasse de Carro
        ModeloCarro saveiro = new ModeloCarro();
        saveiro.setModelo("Saveiro");
        saveiro.setVersao("Trendline");
        saveiro.setAnoDoCarro(2011);
        saveiro.calculaPrecoMedio(14999.99, 15600.50, 16500.00);
        saveiro.exibeFicha();
    }
}
