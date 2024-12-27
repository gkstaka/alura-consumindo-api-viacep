package br.com.alura.viacep.service;

import br.com.alura.viacep.model.Endereco;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class EscreveArquivoJson {
    public void escreveJson(Endereco endereco){
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        try {
            FileWriter fileWriter = new FileWriter(endereco.cep() + ".json");
            fileWriter.write(gson.toJson(endereco));
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException("Falha ao escrever arquivo");
        }

    }
}
