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
        int rolamentoDado = new Random().nextInt(20) + 1;

        int dano = rolamentoDado + getPontosAtaque();
        if (rolamentoDado != 20) {
            dano -= referencia.getPontosDefesa();
        }

        if (rolamentoDado == 1 || dano <= 0) {
            System.out.println("Você errou seu ataque! O inimigo não sofreu dano algum.");
        } else {
            if (rolamentoDado == 20) {
                System.out.println("Você acertou um ataque crítico!");
            }

            referencia.setPontosSaude(referencia.getPontosSaude() - dano);
            System.out.printf("Você atacou %s e causou %s de dano no inimigo.%n", getComplementoArma(), dano);
        }
    }

    private String getComplementoArma() {
        switch (arma) {
            case CLAVA:
            case ESPADA:
                return "com sua " + arma.getNome();
            case MACHADO:
            case MARTELO:
                return "com seu " + arma.getNome();
            case ARCO:
                return "com seu arco, a flecha atingiu";
            case BESTA:
                return "com sua besta, o virote atingiu";
            case CAJADO:
                return "com seu cajado, lançando uma bola de fogo";
            case LIVRO_MAGIAS:
                return "absorvendo energia do livro com uma mão e liberando com a outra";
        }
        return "";
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
