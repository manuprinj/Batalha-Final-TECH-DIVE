package br.com.techdive.batalhafinal.manuprinj.classesdecombate;


import br.com.techdive.batalhafinal.manuprinj.Jogador;
import br.com.techdive.batalhafinal.manuprinj.types.Arma;
import br.com.techdive.batalhafinal.manuprinj.types.Motivacao;


public class Mago extends Jogador {

    public Mago(String nome, String sexo, Motivacao motivacao, Arma arma) {
        super(19, 11, nome, sexo, motivacao, arma);
        if ((!arma.equals(Arma.CAJADO) && !arma.equals(Arma.LIVRO_MAGIAS))) {
            throw new IllegalArgumentException("Arma inválida!");
        }
    }
}
