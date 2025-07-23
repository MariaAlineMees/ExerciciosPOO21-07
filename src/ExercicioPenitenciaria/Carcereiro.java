package ExercicioPenitenciaria;

import java.util.Random;

public class Carcereiro {
    private int id;
    private String nome;
    private String dataNascimento;
    private String turno;
    private String telefone;


    public Carcereiro(String nome, String dataNascimento, String turno, String telefone) {
        this.id = new Random().nextInt(1000);
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.turno = turno;
        this.telefone = telefone;
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

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
