package br.com.techdive.batalhafinal.manuprinj.inimigos;


import java.util.Random;

import br.com.techdive.batalhafinal.manuprinj.Inimigo;
import br.com.techdive.batalhafinal.manuprinj.Personagem;
import br.com.techdive.batalhafinal.manuprinj.types.Arma;


public class Armeiro extends Inimigo {

    public static final int SAUDE_MAXIMA = 100;

    public Armeiro() {
        super(SAUDE_MAXIMA, 10, 15, Arma.ESPADA);
    }

    @Override
    public void atacar(Personagem referencia) {
        int rolamentoDado = new Random().nextInt(20) + 1;

        int dano = rolamentoDado + getPontosAtaque();
        if (rolamentoDado != 20) {
            dano -= referencia.getPontosDefesa();
        }

        if (rolamentoDado == 1 || dano <= 0) {
            System.out.println("O inimigo errou o ataque! Você não sofreu dano.");
        } else {
            if (rolamentoDado == 20) {
                System.out.println("O inimigo acertou um ataque crítico!");
            } else {
                System.out.println("O inimigo atacou!");
            }

            referencia.setPontosSaude(referencia.getPontosSaude() - dano);
            System.out.printf("Você sofreu %s de dano e agora possui %s pontos de vida.%n", dano, referencia.getPontosSaude());
        }
    }
}
