package br.com.alura.viacep.model;

public record Endereco(String cep, String logradouro, String complemento, String unidade, String bairro, String localidade, String uf) {
}
