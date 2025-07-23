package Exercicio02;

public class Fabricante {
    private String nome;
    private String pais;
    private int anoFundacao;

    public Fabricante(String nome, String pais, int anoFundacao) {
        this.nome = nome;
        this.pais = pais;
        this.anoFundacao = anoFundacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }
}
