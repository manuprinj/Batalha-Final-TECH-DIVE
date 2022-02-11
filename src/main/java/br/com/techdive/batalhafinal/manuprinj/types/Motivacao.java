package br.com.techdive.batalhafinal.manuprinj.types;


public enum Motivacao {
    VINGANCA("Vingança"),
    GLORIA("Glória");

    private final String nome;

    Motivacao(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
