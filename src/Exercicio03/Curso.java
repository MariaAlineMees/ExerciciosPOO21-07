package Exercicio03;

public class Curso {
    private String nome;
    private Professor professor;
    private int duracaoMeses;
    private Disciplina disciplina;

    public Curso(String nome, Professor professor, int duracaoMeses, Disciplina disciplina) {
        this.nome = nome;
        this.professor = professor;
        this.duracaoMeses = duracaoMeses;
        this.disciplina = disciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public int getDuracaoMeses() {
        return duracaoMeses;
    }

    public void setDuracaoMeses(int duracaoMeses) {
        this.duracaoMeses = duracaoMeses;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public void mostrarCurso() {
        System.out.println("===== CURSO =====");
        System.out.println("Nome: " + nome);
        System.out.println("Duração: " + duracaoMeses + " meses");
        professor.exibirInformacoes();
    }
}
