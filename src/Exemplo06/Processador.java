package Exemplo06;

public class Processador {
    private int id;
    private String modelo;
    private int qtdNucleos;
    private double ghz;
    private Marca marca;

    public Processador(String modelo, int qtdNucleos, int id, double ghz, Marca marca) {
        this.modelo = modelo;
        this.qtdNucleos = qtdNucleos;
        this.id = id;
        this.ghz = ghz;
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQtdNucleos() {
        return qtdNucleos;
    }

    public void setQtdNucleos(int qtdNucleos) {
        this.qtdNucleos = qtdNucleos;
    }

    public double getGhz() {
        return ghz;
    }

    public void setGhz(double ghz) {
        this.ghz = ghz;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
}
