package br.com.techdive.batalhafinal.manuprinj.inimigos;


import br.com.techdive.batalhafinal.manuprinj.Inimigo;
import br.com.techdive.batalhafinal.manuprinj.types.Arma;


public class Lider extends Inimigo {

    public static final int SAUDE_MAXIMA = 200;

    public Lider() {
        super(SAUDE_MAXIMA, 15, 15, Arma.MACHADO_DUPLO);
    }
}
