package br.com.techdive.batalhafinal.manuprinj.types;


public enum Arma {
    ESPADA("Espada"),
    MACHADO("Machado"),
    MARTELO("Martelo"),
    CLAVA("Clava"),
    ARCO("Arco"),
    BESTA("Besta"),
    CAJADO("Cajado"),
    LIVRO_MAGIAS("Livro de Magias"),
    ARMADILHA("Armadilha"),
    MACHADO_DUPLO("Machado Duplo");

    private final String nome;

    Arma(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
