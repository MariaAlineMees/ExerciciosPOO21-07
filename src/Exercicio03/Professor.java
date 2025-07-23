package Exercicio03;

import java.util.Random;

public class Professor {
    private int id;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private Disciplina disciplina;

    public Professor(String nome, String cpf, String email, String telefone, Disciplina disciplina) {
        this.id = new Random().nextInt(1000);
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.disciplina = disciplina;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public void exibirInformacoes() {
        System.out.println("===== PROFESSOR =====");
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);

        System.out.println("Disciplina: " + disciplina.getNome());
        System.out.println("Carga Horária da Disciplina: " + disciplina.getCargaHoraria() + "h");
    }



}
