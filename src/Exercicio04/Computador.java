package Exercicio04;

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

    public void exibirDados() {
        System.out.println("===== DADOS DO COMPUTADOR =====");
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Modelo: " + modelo);

        System.out.println("\n--- PROCESSADOR ---");
        System.out.println("Modelo: " + processador.getModelo());
        System.out.println("Núcleos: " + processador.getQtdNucleos());
        System.out.println("Frequência: " + processador.getGhz() + " GHz");

        System.out.println("\n--- MARCA DO PROCESSADOR ---");
        System.out.println("Marca: " + processador.getMarca().getNome());
        System.out.println("ID da Marca: " + processador.getMarca().getId());
    }
}
