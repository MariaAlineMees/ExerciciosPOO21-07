package Exercicio06;

public class Veterinario {
    private String nome;
    private String telefone;

    public Veterinario(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void mostrarInformacoes() {
        System.out.println("===== VETERINARIO =====");
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("===== ===== ===== =====");
    }
}
