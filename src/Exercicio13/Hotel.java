package Exercicio13;

import java.util.ArrayList;

public class Hotel {
    private int id;
    private String nome;
    private String telefone;
    private String email;
    private String cnpj;
    private Endereco endereco;
    private ArrayList<Quarto> quarto;

    public Hotel(String nome, String telefone, String email, String cnpj, Endereco endereco, ArrayList<Quarto> quarto) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.quarto = quarto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Quarto> getQuarto() {
        return quarto;
    }

    public void setQuarto(ArrayList<Quarto> quarto) {
        this.quarto = quarto;
    }

    public void exibirHotel(){
        System.out.println("===== HOTEL =====");
        System.out.println("Nome: "+getNome());
        System.out.println("Telefone: "+getTelefone());
        System.out.println("Email: "+getEmail());
        System.out.println("CNPJ: "+getCnpj());
        System.out.println("===============");

    }

    public void exibirQuartos(){
        System.out.println("===== QUARTOS =====");
        System.out.println("===============");
        for (var quarto : this.quarto){
            quarto.exibirQuarto();
        }
        System.out.println("===============");
    }
}
