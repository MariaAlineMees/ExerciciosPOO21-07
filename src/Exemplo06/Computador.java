package Exemplo06;

public class Computador {
    private int id;
    private String nome;
    private String modelo;
    private Processador processador;

    public Computador(String nome, String modelo, int id, Processador processador) {
        this.nome = nome;
        this.modelo = modelo;
        this.id = id;
        this.processador = processador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }
}
