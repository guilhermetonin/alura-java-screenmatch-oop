package desafios.cep;

import desafios.cep.modelo.ConsultaCep;
import desafios.cep.modelo.Endereco;
import desafios.cep.modelo.GeradorDeArquivo;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número de CEP para consulta: ");
        var cep = leitura.nextLine();

        ConsultaCep consulta = new ConsultaCep();
        try {
            Endereco novoEndereco = consulta.buscaEndereco(cep);
            System.out.println(novoEndereco);

            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.geraJson(novoEndereco);

        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando aplicação.");
        }
    }
}
