package desafios.extras.herancas.carro;

public class ModeloCarro extends Carro {
    private String versao;
    private int anoDoCarro;

    public String getVersao() {
        return versao;
    }

    public int getAnoDoCarro() {
        return anoDoCarro;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public void setAnoDoCarro(int anoDoCarro) {
        this.anoDoCarro = anoDoCarro;
    }
}
