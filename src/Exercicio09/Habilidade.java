package Exercicio09;

public class Habilidade {
    private String nome;
    private String tipo;
    private int poder;
    private String descricao;

    public Habilidade(String nome, String tipo, int poder, String descricao) {
        this.nome = nome;
        this.tipo = tipo;
        this.poder = poder;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPoder() {
        return poder;
    }

    public String getDescricao() {
        return descricao;
    }

    public void usar() {
        System.out.println("Usando habilidade: " + nome + " [" + tipo + "] - " + descricao + " (Poder: " + poder + ")");
    }
}