package Exercicio05;

import java.util.Random;

public class Telefone {
    private int id;
    private String marca;
    private String modelo;
    private String cor;
    private Chip chip;
    private Operadora operadora;

    public Telefone(String marca, String modelo, String cor,Chip chip, Operadora operadora) {
        this.id = new Random().nextInt(1000);
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.chip = chip;
        this.operadora = operadora;
    }

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

    public Chip getChip() {
        return chip;
    }

    public void setChip(Chip chip) {
        this.chip = chip;
    }

    public Operadora getOperadora() {
        return operadora;
    }

    public void setOperadora(Operadora operadora) {
        this.operadora = operadora;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void exibirInformacoes() {
        System.out.println("===== TELEFONE =====");
        System.out.println("ID: " + id);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("===== ===== ===== ===== ");
    }
}
