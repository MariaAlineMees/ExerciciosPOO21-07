package Exercicio01;

public class Pessoa {
    private int id;
    private String nome;
    private String dataNascimento;
    private String cpf;
    private String email;
    private Endereco endereco;


    public Pessoa(String nome, int id, String dataNascimento, String email, String cpf, Endereco endereco) {
        this.nome = nome;
        this.id = id;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}

