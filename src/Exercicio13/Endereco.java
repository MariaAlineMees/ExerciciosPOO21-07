package Exercicio13;

public class Endereco {
    private String rua;
    private String cep;
    private String bairro;
    private String cidade;
    private int numero;


    public Endereco(String rua, String cep, String bairro, String cidade, int numero) {
        this.rua = rua;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void exibirEndereco() {
        System.out.println("===== ENDERECO =====");
        System.out.println("Rua: " + this.rua);
        System.out.println("Cep: " + this.cep);
        System.out.println("Bairro: " + this.bairro);
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Numero: " + this.numero);
        System.out.println("===============");
    }
}
