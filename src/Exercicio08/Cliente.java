package Exercicio08;


public class Cliente {
    private int id;
    private String nome;
    private String dataNascimento;
    private String cpf;
    private String email;

    public Cliente(int id, String nome, String dataNascimento, String email, String cpf) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.cpf = cpf;
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

    public void mostrarInformacoes() {
        System.out.println("===== CLIENTE =====");
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Email: " + email);
        System.out.println("CPF: " + cpf);
        System.out.println("===== ===== ===== =====");
    }
}
