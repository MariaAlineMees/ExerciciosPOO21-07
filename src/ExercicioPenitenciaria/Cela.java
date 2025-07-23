package ExercicioPenitenciaria;

import java.util.ArrayList;

public class Cela {
    private int capacidade;
    private int numero;
    private String bloco;
    private boolean ocupada;
    private ArrayList<Detento> detentos;

    public Cela(int capacidade, int numero, String bloco, boolean ocupada, String s) {
        this.capacidade = capacidade;
        this.numero = numero;
        this.bloco = bloco;
        this.ocupada = ocupada;
        this.detentos = new ArrayList<>();
    }

    public void addDetento(Detento detento) {
        if (detentos.size() < capacidade) {
            detentos.add(detento);
        } else {
            System.out.println("Cela " + numero + " já está cheia!");
        }
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getNumero() {
        return numero;
    }

    public String getBloco() {
        return bloco;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public ArrayList<Detento> getDetentos() {
        return detentos;
    }
}
