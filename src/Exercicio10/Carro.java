package Exercicio10;

import Exercicio02.Fabricante;

import java.util.Random;

public class Carro {
    private int id;
    private String modelo;
    private String cor;
    private int ano;
    private Motor motor;
    private Fabricante fabricante;
    private Proprietario proprietario;

    public Carro(String modelo, int ano, String cor, Motor motor, Fabricante fabricante, Proprietario proprietario) {
        this.id = new Random().nextInt(1000);
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.motor = motor;
        this.fabricante = fabricante;
        this.proprietario = proprietario;
    }

    public void exibirInformacoes() {
        System.out.println("===== DADOS DO CARRO =====");
        System.out.println("ID: " + id);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);

        System.out.println("\n--- MOTOR ---");
        System.out.println("Modelo: " + motor.getModelo());
        System.out.println("Núcleos: " + motor.getQtdNucleos());
        System.out.println("Frequência: " + motor.getGhz() + " GHz");
        System.out.println("Marca do motor: " + motor.getMarca().getNome());

        System.out.println("\n--- PROPRIETÁRIO ---");
        System.out.println("Nome: " + proprietario.getNome());
        System.out.println("CPF: " + proprietario.getCpf());
        System.out.println("Telefone: " + proprietario.getTelefone());
    }
}