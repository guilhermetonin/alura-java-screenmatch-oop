package desafios.sistemacompras;

import desafios.sistemacompras.modelo.CartaoCredito;
import desafios.sistemacompras.modelo.Compra;

import java.util.Collections;
import java.util.Scanner;

public class Principal {
    static void main() {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o limite do cartão de crédito: ");
        double limite = Double.parseDouble(leitura.nextLine());
        CartaoCredito cartao = new CartaoCredito(limite);

        int opcao = 1;
        while (opcao != 0) {

            System.out.println("\nDigite a descrição da compra: ");
            String descricao = leitura.nextLine();

            System.out.println("Digite o valor da compra: ");
            double valor = Double.parseDouble(leitura.nextLine());

            Compra compra = new Compra(descricao, valor);
            boolean compraRealizada = cartao.realizaCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada com sucesso!");
                System.out.println("\nDigite (0) para sair e (1) para continuar.");
                opcao = Integer.parseInt(leitura.nextLine());
            } else {
                System.out.println("Saldo insuficiente!");
                opcao = 0;
            }

            System.out.println("\n-------- COMPRAS REALIZADAS ----------");
            Collections.sort(cartao.getListaCompras());
            for (Compra c: cartao.getListaCompras()) {
                    System.out.printf("%s - R$ %.2f \n", c.getDescricao(), c.getValor());
            }
            System.out.println("--------------------------------------");
            System.out.printf("Saldo do cartão: R$ %.2f \n", cartao.getSaldo());
        }
    }
}