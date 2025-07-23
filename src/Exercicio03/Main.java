package Exercicio03;

public class Main {
    public static void main(String[] args) {
        Disciplina poo = new Disciplina("Programação Orientada a Objetos", 60);
        Professor professor = new Professor("Diogo Fonseca", "123.456.789-00", "diogo@gmail.com", "(47) 99999-9999", poo);
        Curso curso = new Curso("Tecnologia em Sistemas", professor, 24, poo);

        curso.mostrarCurso();
    }


}
