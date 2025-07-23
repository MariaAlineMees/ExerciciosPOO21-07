package Exercicio05;

import java.util.Random;

public class Chip {
    private int id;
    private String fabricante;
    private String modelo;
    private String numero;

    public Chip(String fabricante, String modelo, String numero) {
        this.id = new Random().nextInt(1000);
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.numero = numero;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getId() {
        return id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void exibirInformacoes() {
        System.out.println("===== CHIP =====");
        System.out.println("ID: " + id);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Modelo: " + modelo);
        System.out.println("Numero: " + numero);
        System.out.println("===== ===== ===== =====");
    }
}
