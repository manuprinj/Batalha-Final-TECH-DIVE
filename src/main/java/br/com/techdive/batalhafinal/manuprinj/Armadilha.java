package br.com.techdive.batalhafinal.manuprinj;


import java.util.Random;

import br.com.techdive.batalhafinal.manuprinj.types.Arma;


public class Armadilha implements Atacante {

    private int pontosDeAtaque;
    private Arma arma;

    public Armadilha() {
        this.pontosDeAtaque = 5;
        this.arma = Arma.ARMADILHA;
    }

    @Override
    public void atacar(Personagem referencia) {
        int rolamentoDado = new Random().nextInt(10) + 1;
        System.out.println(rolamentoDado);

        int dano = rolamentoDado + pontosDeAtaque - referencia.getPontosDefesa();
        if (rolamentoDado == 1 || dano <= 0) {
            System.out.println("O ataque da armadilha pegou de raspão e você não sofreu dano.");
        } else {
            referencia.setPontosSaude(referencia.getPontosSaude() - dano);
            System.out.printf("Você sofreu %s de dano e agora possui %s pontos de vida.%n", dano, referencia.getPontosSaude());
        }
    }
}
