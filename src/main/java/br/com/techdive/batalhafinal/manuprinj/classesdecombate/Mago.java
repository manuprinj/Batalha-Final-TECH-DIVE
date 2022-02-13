package br.com.techdive.batalhafinal.manuprinj.classesdecombate;


import br.com.techdive.batalhafinal.manuprinj.Jogador;
import br.com.techdive.batalhafinal.manuprinj.types.Arma;


public class Mago extends Jogador {

    public Mago(String nome, String sexo, Arma arma) {
        super(19, 11, nome, sexo, arma);
        if ((!arma.equals(Arma.CAJADO) && !arma.equals(Arma.LIVRO_MAGIAS))) {
            throw new IllegalArgumentException("Arma inválida!");
        }
    }
}
