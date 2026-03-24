package desafios.extras.api.github;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome do usuário do GitHub: ");
        var usuario = leitura.nextLine();

        String url = "https://api.github.com/users/" + usuario + "/repos";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Accept", "application/vnd.github+json")
                .header("User-Agent", "Java-HttpClient")
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            Gson gson = new Gson();

            System.out.println(response.body());

            Repositorio[] arrayRepos = gson.fromJson(response.body(), Repositorio[].class);

            var listaRepos = new ArrayList<>(List.of(arrayRepos));

            System.out.println("Lista de repositórios de " + usuario);
            for (Repositorio repo : listaRepos) {
                System.out.println("-" + repo.name());
            }
        } else {
            System.out.println("Erro ao buscar repositórios. " + response.statusCode());
        }
    }
}