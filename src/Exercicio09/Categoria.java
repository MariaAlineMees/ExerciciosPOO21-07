package Exercicio09;

public class Categoria {
    private String nome;
    private Habilidade habilidadeBasica;
    private Habilidade habilidadeEspecial;

    public Categoria(String nome, Habilidade habilidadeBasica, Habilidade habilidadeEspecial) {
        this.nome = nome;
        this.habilidadeBasica = habilidadeBasica;
        this.habilidadeEspecial = habilidadeEspecial;
    }

    public String getNome() {
        return nome;
    }

    public Habilidade getHabilidadeBasica() {
        return habilidadeBasica;
    }

    public Habilidade getHabilidadeEspecial() {
        return habilidadeEspecial;
    }
}