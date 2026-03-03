package desafios.tres.carro;

public class Carro {
    private String modelo;
    private double precoMedio;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double calculaPrecoMedio(double... precos) {
        double soma = 0;
        double menorPreco = precos[0];
        double maiorPreco = precos[0];
        for (double preco : precos) {
            soma += preco;
            if (preco > maiorPreco) {
                maiorPreco = preco;
            }
            if (preco < menorPreco) {
                menorPreco = preco;
            }
        }
        return this.precoMedio = soma / precos.length;
    }

    public void exibeFicha() {
        System.out.printf("""
                Modelo: %s
                Preço Médio: %.2f
                """, this.modelo, this.precoMedio);
    }

}
