package Exercicio13;

public class Quarto {
    private int idQuarto;
    private String numeroQuarto;
    private String tipoQuarto;
    private String statusQuarto;
    private double valorDiariaQuarto;

    public Quarto(int idQuarto, String numeroQuarto, String tipoQuarto, String statusQuarto, double valorDiariaQuarto) {
        this.idQuarto = idQuarto;
        this.numeroQuarto = numeroQuarto;
        this.tipoQuarto = tipoQuarto;
        this.statusQuarto = statusQuarto;
        this.valorDiariaQuarto = valorDiariaQuarto;
    }

    public int getIdQuarto() {
        return idQuarto;
    }

    public void setIdQuarto(int idQuarto) {
        this.idQuarto = idQuarto;
    }

    public String getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(String numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(String tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public String getStatusQuarto() {
        return statusQuarto;
    }

    public void setStatusQuarto(String statusQuarto) {
        this.statusQuarto = statusQuarto;
    }

    public double getValorDiariaQuarto() {
        return valorDiariaQuarto;
    }

    public void setValorDiariaQuarto(double valorDiariaQuarto) {
        this.valorDiariaQuarto = valorDiariaQuarto;
    }

    public void exibirQuarto() {
        System.out.println("===== QUARTO " + idQuarto + " =====");
        System.out.println("Numero do quarto: " + numeroQuarto);
        System.out.println("Tipo do quarto: " + tipoQuarto);
        System.out.println("Status do quarto: " + statusQuarto);
        System.out.println("Valor da diaria: " + valorDiariaQuarto);
        System.out.println("===== ===== ===== =====");
    }
}
