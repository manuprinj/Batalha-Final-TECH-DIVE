package br.com.techdive.batalhafinal.manuprinj;


import java.util.Random;

import br.com.techdive.batalhafinal.manuprinj.types.Arma;
import br.com.techdive.batalhafinal.manuprinj.types.Motivacao;


public abstract class Jogador extends Personagem implements Atacante {

    public static final int SAUDE_MAXIMA = 200;
    private String nome;
    private String sexo;
    private Motivacao motivacao;
    private Arma arma;

    public Jogador(int pontosAtaque, int pontosDefesa, String nome, String sexo, Arma arma) {
        super(SAUDE_MAXIMA, pontosAtaque, pontosDefesa);
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome não pode ser em branco!");
        }
        this.nome = nome;
        if (sexo == null || !(sexo.equals("M") || sexo.equals("F"))) {
            throw new IllegalArgumentException("Sexo inválido");
        }
        this.sexo = sexo;
        this.arma = arma;
    }

    @Override
    public void atacar(Personagem referencia) {
        int rolamentoDado = new Random().nextInt(10) + 1;
        System.out.println(rolamentoDado);

        int dano = rolamentoDado + getPontosAtaque() - referencia.getPontosDefesa();
        if (rolamentoDado == 1 || dano <= 0) {
            System.out.println("O ataque da armadilha pegou de raspão e você não sofreu dano.");
        } else {
            referencia.setPontosSaude(referencia.getPontosSaude() - dano);
            System.out.printf("Você sofreu %s de dano e agora possui %s pontos de vida.%n", dano, referencia.getPontosSaude());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Motivacao getMotivacao() {
        return motivacao;
    }

    public void setMotivacao(Motivacao motivacao) {
        this.motivacao = motivacao;
    }
}
