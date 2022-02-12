package br.com.techdive.batalhafinal.manuprinj.classesdecombate;


import br.com.techdive.batalhafinal.manuprinj.Jogador;
import br.com.techdive.batalhafinal.manuprinj.types.Arma;
import br.com.techdive.batalhafinal.manuprinj.types.Motivacao;


public class Gurreiro extends Jogador {

    public Gurreiro(String nome, String sexo, Motivacao motivacao, Arma arma) {
        super(15, 15, nome, sexo, motivacao, arma);
        if ((!arma.equals(Arma.ESPADA) && !arma.equals(Arma.MACHADO))) {
            throw new IllegalArgumentException("Arma inválida!");
        }
    }
}
