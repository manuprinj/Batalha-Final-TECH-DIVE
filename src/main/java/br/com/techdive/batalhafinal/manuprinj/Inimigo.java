package br.com.techdive.batalhafinal.manuprinj;


import br.com.techdive.batalhafinal.manuprinj.types.Arma;


public abstract class Inimigo extends Personagem implements Atacante {

    private Arma arma;

    public Inimigo(int saude, int pontosAtaque, int pontosDefesa, Arma arma) {
        super(saude, pontosAtaque, pontosDefesa);
        this.arma = arma;
    }
}
