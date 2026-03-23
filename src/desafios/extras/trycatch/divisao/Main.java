package desafios.extras.trycatch.divisao;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numerador, denominador, resultado;

        try {
            System.out.println("Digite o numerador: ");
            numerador = leitura.nextInt();

            System.out.println("Digite o denominador: ");
            denominador = leitura.nextInt();

            resultado = (numerador / denominador);
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
