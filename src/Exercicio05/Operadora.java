package Exercicio05;

public class Operadora {
    private String nome;
    private String codigo;

    public Operadora(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void exibirInformacoes() {
        System.out.println("===== OPERADORA =====");
        System.out.println("Nome: " + nome);
        System.out.println("Codigo: " + codigo);
        System.out.println("===== ===== ===== =====");
    }
}
