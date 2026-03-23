package desafios.extras.trycatch.login;

import desafios.extras.trycatch.login.excecao.SenhaInvalidaException;
import desafios.extras.trycatch.login.modelo.Usuario;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        String nome, user, email, senha;

        try {
            System.out.println("Digite seu nome:");
            nome = leitura.nextLine();

            System.out.println("Digite o nome de usuário escolhido:");
            user = leitura.nextLine();

            System.out.println("Digite o email:");
            email = leitura.nextLine();

            System.out.println("Digite sua senha:");
            senha = leitura.nextLine();

            Usuario usuario = new Usuario(nome, user, email, senha);
            System.out.println(usuario);
        } catch (SenhaInvalidaException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Programa finalizado");
        }
    }
}
