package br.com.techdive.batalhafinal.manuprinj;


abstract class Personagem {

    private int saude;
    private int pontosAtaque;
    private int pontosDefesa;

    public Personagem(int saude, int pontosAtaque, int pontosDefesa) {
        this.saude = saude;
        this.pontosAtaque = pontosAtaque;
        this.pontosDefesa = pontosDefesa;
    }
}
