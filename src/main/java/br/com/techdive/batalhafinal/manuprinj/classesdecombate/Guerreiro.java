package br.com.techdive.batalhafinal.manuprinj.classesdecombate;


import br.com.techdive.batalhafinal.manuprinj.Jogador;
import br.com.techdive.batalhafinal.manuprinj.types.Arma;


public class Guerreiro extends Jogador {

    public Guerreiro(String nome, String sexo, Arma arma) {
        super(15, 15, nome, sexo, arma);
        if ((!arma.equals(Arma.ESPADA) && !arma.equals(Arma.MACHADO))) {
            throw new IllegalArgumentException("Arma inválida!");
        }
    }
}
