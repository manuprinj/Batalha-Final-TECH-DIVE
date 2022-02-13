package br.com.techdive.batalhafinal.manuprinj;


public abstract class Personagem {

    private int pontosSaude;
    private int pontosAtaque;
    private int pontosDefesa;

    public Personagem(int pontosSaude, int pontosAtaque, int pontosDefesa) {
        this.pontosSaude = pontosSaude;
        this.pontosAtaque = pontosAtaque;
        this.pontosDefesa = pontosDefesa;
    }

    public int getPontosSaude() {
        return pontosSaude;
    }

    public void setPontosSaude(int pontosSaude) {
        this.pontosSaude = pontosSaude;
    }

    public int getPontosAtaque() {
        return pontosAtaque;
    }

    public void setPontosAtaque(int pontosAtaque) {
        this.pontosAtaque = pontosAtaque;
    }

    public int getPontosDefesa() {
        return pontosDefesa;
    }

    public void setPontosDefesa(int pontosDefesa) {
        this.pontosDefesa = pontosDefesa;
    }
}
