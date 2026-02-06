package br.com.alura.screenmatch.service;

public interface IConverteDados {
    // T é um dado genérico.
    <T> T obterDados(String json, Class<T> classe);
}
