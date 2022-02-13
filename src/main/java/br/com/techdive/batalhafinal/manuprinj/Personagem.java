package br.com.techdive.batalhafinal.manuprinj;


public abstract class Personagem {

    private int pontosSaude;
    private int pontosAtaque;
    private int pontosDefesa;

    public Personagem(int pontosSaude, int pontosAtaque, int pontosDefesa) {
        this.pontosSaude = pontosSaude;
        this.pontosAtaque = pontosAtaque;
        this.pontosDefesa = pontosDefesa;
    }
}
