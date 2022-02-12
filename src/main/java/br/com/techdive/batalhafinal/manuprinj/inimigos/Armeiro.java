package br.com.techdive.batalhafinal.manuprinj.inimigos;


import br.com.techdive.batalhafinal.manuprinj.Inimigo;
import br.com.techdive.batalhafinal.manuprinj.types.Arma;


public class Armeiro extends Inimigo {

    public static final int SAUDE_MAXIMA = 100;

    public Armeiro() {
        super(SAUDE_MAXIMA, 10, 15, Arma.ESPADA);
    }
}
