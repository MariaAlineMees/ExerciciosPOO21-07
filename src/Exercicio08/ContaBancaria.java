package Exercicio08;

public class ContaBancaria {
    private  String numeroConta;
    private  String numeroAgencia;
    private  double saldo;
    private Cliente cliente;

    public ContaBancaria(String numeroConta, String numeroAgencia, double saldo, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void mostrarInformacoes() {
        System.out.println("===== CONTA BANCARIA =====");
        System.out.println("N° Conta: " + numeroConta);
        System.out.println("N° Agencia: " + numeroAgencia);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("===== ===== ===== =====");
    }
}
