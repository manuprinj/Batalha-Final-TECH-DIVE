package br.com.techdive.batalhafinal.manuprinj;


import br.com.techdive.batalhafinal.manuprinj.types.Arma;


public class Armadilha implements Atacante {

    private int pontosDeAtaque;
    private Arma arma;

    public Armadilha() {
        this.pontosDeAtaque = 5;
        this.arma = Arma.ARMADILHA;
    }
}
