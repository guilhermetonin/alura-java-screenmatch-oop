package desafios.extras.gson.veiculos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import desafios.extras.gson.veiculos.modelo.Veiculo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static void main(String[] args) throws IOException {

        Veiculo onix = new Veiculo("Chevrolet", "Onix", 2021);
        Veiculo hb20 = new Veiculo("Hyundai", "HB20", 2022);
        Veiculo corolla = new Veiculo("Toyota", "Corolla", 2023);
        Veiculo renegade = new Veiculo("Jeep", "Renegade", 2020);
        List<Veiculo> veiculos = new ArrayList<>(Arrays.asList(onix, hb20, corolla, renegade));

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        FileWriter escrita = new FileWriter("veiculos.json");
        escrita.write(gson.toJson(veiculos));
        escrita.close();

    }
}
