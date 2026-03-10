package desafios.extras.listas.produto;

import java.util.ArrayList;

public class Principal {
    static void main(String[] args) {

        // instâncias (Produto)
        Produto caderno = new Produto("Caderno", 15.50, 25);
        Produto estojo = new Produto("Estojo", 7.00, 10);
        Produto lapis =  new Produto("Lapis", 2.50, 40);

        // cria uma lista dos produtos
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(caderno);
        listaProdutos.add(estojo);
        listaProdutos.add(lapis);

        // exibe na tela
        System.out.println("Lista de Produtos: " + listaProdutos);

        // instâncias (ProdutoPerecivel)
        ProdutoPerecivel miojo = new ProdutoPerecivel("Miojo", 3.50, 25, "25/03/2026");
        ProdutoPerecivel bolacha = new ProdutoPerecivel("Óreo", 3.00, 10, "30/05/2026");

        // cria uma lista dos produtos periciveis
        ArrayList<Produto> listaProdutosPericiveis = new ArrayList<>();
        listaProdutosPericiveis.add(miojo);
        listaProdutosPericiveis.add(bolacha);

        // exibe na tela
        System.out.println("\nLista de Produtos Pericíveis: " + listaProdutosPericiveis);

        // calcula o preco médio
        double precoMedio = 0;
        for (Produto item: listaProdutos) {
            precoMedio += item.getPreco();
        }
        System.out.printf("\nPreço médio: R$ %.2f", precoMedio / listaProdutos.size());

    }
}
