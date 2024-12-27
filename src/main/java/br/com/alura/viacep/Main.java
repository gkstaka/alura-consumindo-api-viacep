package br.com.alura.viacep;

import br.com.alura.viacep.model.Endereco;
import br.com.alura.viacep.service.ConsultaCep;
import br.com.alura.viacep.service.EscreveArquivoJson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("Entre com um cep: ");
        String cep = scanner.nextLine();

        try {
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            new EscreveArquivoJson().escreveJson(novoEndereco);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Aplicacao finalizada");
        }
    }
}
