package Exercicio06;

import java.util.Random;

public class Cachorro {
    private String nome;
    private String raca;
    private int idade;
    private String cor;
    private Dono dono;
    private Veterinario veterinario;

    public Cachorro(String nome, String raca, int idade, String cor, Dono dono, Veterinario veterinario) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
        this.dono = dono;
        this.veterinario = veterinario;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public void mostrarInformacoes() {
        System.out.println("===== CACHORRO =====");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Raca: " + this.getRaca());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Dono: " + this.getDono().getNome());
        System.out.println("Veterinario: " + this.getVeterinario().getNome());
        System.out.println("===== ===== ===== =====");
    }
}
