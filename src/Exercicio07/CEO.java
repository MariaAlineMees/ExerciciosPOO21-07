package Exercicio07;

public class CEO {
    private int id;
    private String nome;
    private int idade;
    private String experiencia;

    public CEO(int id, String nome, int idade, String experiencia) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.experiencia = experiencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public void mostrarInformacoes() {
        System.out.println("===== CEO =====");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Experiencia: " + this.getExperiencia());
        System.out.println("===== ===== ===== =====");
    }
}
