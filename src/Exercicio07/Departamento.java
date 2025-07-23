package Exercicio07;

import java.util.Random;

public class Departamento {
    private String nome;
    private int numFuncionarios;

    public Departamento(String nome, int numFuncionarios) {
        this.nome = nome;
        this.numFuncionarios = numFuncionarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    public void mostrarInformacoes() {
        System.out.println("Departamento: " + this.getNome());
        System.out.println("Número de funcionários: " + this.getNumFuncionarios());
    }
}
