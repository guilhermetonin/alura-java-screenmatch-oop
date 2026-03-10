package desafios.extras.listas.produto;

public class ProdutoPerecivel extends Produto {
    private String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.setDataValidade(dataValidade);
    }

    public String getDataValidade() {
        return this.dataValidade;
    }

    private void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
