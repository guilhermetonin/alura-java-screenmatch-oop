package desafios.extras.listas.pessoa;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        // instâncias
        Pessoa guilherme = new Pessoa("Guilherme", 19);
        Pessoa joao = new Pessoa("João", 20);
        Pessoa julia = new Pessoa("Júlia", 23);

        // cria um arraylist de pessoas
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(guilherme);
        listaDePessoas.add(joao);
        listaDePessoas.add(julia);

        // exibe na tela
        System.out.println("Tamanho da Lista: " + listaDePessoas.size());
        System.out.println("Primeiro Elemento: " + listaDePessoas.get(0));
        System.out.println("Todas as Pessoas: " + listaDePessoas);
    }
}
