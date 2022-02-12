package br.com.techdive.batalhafinal.manuprinj.classesdecombate;


import br.com.techdive.batalhafinal.manuprinj.Jogador;
import br.com.techdive.batalhafinal.manuprinj.types.Arma;
import br.com.techdive.batalhafinal.manuprinj.types.Motivacao;


public class Paladino extends Jogador {

    public Paladino(String nome, String sexo, Motivacao motivacao, Arma arma) {
        super(13, 18, nome, sexo, motivacao, arma);
        if ((!arma.equals(Arma.MARTELO) && !arma.equals(Arma.CLAVA))) {
            throw new IllegalArgumentException("Arma inválida!");
        }
    }
}
