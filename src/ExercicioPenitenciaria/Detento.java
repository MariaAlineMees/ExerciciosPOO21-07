package ExercicioPenitenciaria;

import java.util.Random;

public class Detento {
    private int id;
    private String nome;
    private String dataNascimento;
    private String crime;
    private String tempoSentenca;
    private Cela cela;


    public Detento(String dataNascimento, String nome, String crime, String tempoSentenca, Cela cela){
        this.id = new Random().nextInt(1000);
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.crime = crime;
        this.tempoSentenca = tempoSentenca;
        this.cela = cela;
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

    public int getId() {
        return id;
    }


    public String getCrime() {
        return crime;
    }

    public void setCrime(String crime) {
        this.crime = crime;
    }

    public String getTempoSentenca() {
        return tempoSentenca;
    }

    public void setTempoSentenca(String tempoSentenca) {
        this.tempoSentenca = tempoSentenca;
    }

    public Cela getCela() {
        return cela;
    }

    public void setCela(Cela cela) {
        this.cela = cela;
    }
}
