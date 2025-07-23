package Exercicio08;

public class Banco {
    private  String nome;

    public Banco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void mostrarInformacoes() {
        System.out.println("Banco: " + this.getNome());
    }
}
