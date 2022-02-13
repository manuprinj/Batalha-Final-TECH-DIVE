package br.com.techdive.batalhafinal.manuprinj;


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
        this.motivacao = motivacao;
        this.arma = arma;
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
