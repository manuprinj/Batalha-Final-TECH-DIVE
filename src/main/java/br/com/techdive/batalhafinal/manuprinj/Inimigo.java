package br.com.techdive.batalhafinal.manuprinj;


import java.util.Random;

import br.com.techdive.batalhafinal.manuprinj.types.Arma;


public abstract class Inimigo extends Personagem implements Atacante {

    private Arma arma;

    public Inimigo(int saude, int pontosAtaque, int pontosDefesa, Arma arma) {
        super(saude, pontosAtaque, pontosDefesa);
        this.arma = arma;
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
