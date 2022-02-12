package br.com.techdive.batalhafinal.manuprinj.inimigos;


import br.com.techdive.batalhafinal.manuprinj.Inimigo;
import br.com.techdive.batalhafinal.manuprinj.types.Arma;


public class Alquimista extends Inimigo {

    public static final int SAUDE_MAXIMA = 100;

    public Alquimista() {
        super(SAUDE_MAXIMA, 15, 10, Arma.CAJADO);
    }
}
