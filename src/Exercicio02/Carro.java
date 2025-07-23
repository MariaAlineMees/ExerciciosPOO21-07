package Exercicio02;

import java.util.Random;

public class Carro {
    private int id;
    private String modelo;
    private String cor;
    private int ano;
    private Motor motor;
    private Fabricante fabricante;


    public int getId() {
        return id;
    }
    

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public Carro(String modelo, int ano, String cor, Motor motor, Fabricante fabricante) {
        this.id = new Random().nextInt(1000);
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.motor = motor;
        this.fabricante = fabricante;
        
        
    }

    public void exibirDados() {
        System.out.println("===== DADOS DO CARRO =====");
        System.out.println("ID: " + id);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);

        System.out.println("=== MOTOR ===");
        System.out.println("Cilindrada: " + motor.getCilindrada());
        System.out.println("Potência: " + motor.getPotencia());
        System.out.println("Tipo de combustível: " + motor.getTipoCombustivel());

        System.out.println("=== FABRICANTE ===");
        System.out.println("Nome: " + fabricante.getNome());
        System.out.println("País: " + fabricante.getPais());
        System.out.println("Fundado em: " + fabricante.getAnoFundacao());
    }
}
