package desafios.dois;

public class Produto {
    private String nome;
    private double preco;

    // getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(int percentual) {
        double desconto = (preco * percentual) / 100;
        System.out.println("Preço anterior: " + preco);
        preco = preco - desconto;
        System.out.println("Preço após desconto: " + preco);
    }
}
