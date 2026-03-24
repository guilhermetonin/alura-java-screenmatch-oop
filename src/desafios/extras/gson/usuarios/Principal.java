package desafios.extras.gson.usuarios;

import com.google.gson.Gson;
import desafios.extras.gson.usuarios.modelo.Pessoa;
import desafios.extras.gson.usuarios.modelo.Usuario;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Quantos usuários você quer ver? (0 a 10)");
        int limite = leitura.nextInt();

        String endereco = "https://jsonplaceholder.typicode.com/users?_limit=" + limite;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        Gson gson = new Gson();
        Pessoa[] pessoas = gson.fromJson(json, Pessoa[].class);

        Usuario[] usuarios = new Usuario[pessoas.length];

        for (int i = 0; i < pessoas.length; i++) {
            usuarios[i] = new Usuario(pessoas[i]);
        }

        System.out.println("\n---Lista de Usuários---");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }

    }
}
