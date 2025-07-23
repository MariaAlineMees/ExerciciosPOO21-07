package Exercicio07;

public class Empresa {
    private String nome;
    private Departamento departamento;
    private CEO ceo;

    public Empresa(String nome, Departamento departamento, CEO ceo) {
        this.nome = nome;
        this.departamento = departamento;
        this.ceo = ceo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public CEO getCeo() {
        return ceo;
    }

    public void setCeo(CEO ceo) {
        this.ceo = ceo;
    }

    public void mostrarInformacoes() {
        System.out.println("===== Empresa =====");
        System.out.println("Nome: " + this.getNome());
        System.out.println("===== ===== ===== =====");
    }
}
