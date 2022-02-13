package br.com.techdive.batalhafinal.manuprinj.classesdecombate;


import br.com.techdive.batalhafinal.manuprinj.Jogador;
import br.com.techdive.batalhafinal.manuprinj.types.Arma;


public class Arqueiro extends Jogador {

    public Arqueiro(String nome, String sexo, Arma arma) {
        super(18, 13, nome, sexo, arma);
        if ((!arma.equals(Arma.ARCO) && !arma.equals(Arma.BESTA))) {
            throw new IllegalArgumentException("Arma inválida!");
        }
    }
}
