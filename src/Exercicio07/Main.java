package Exercicio07;

public class Main {
    public static void main(String[] args) {

        CEO ceo = new CEO(1, "João Dativader", 30, "15 anos com Desenvolvimento de Software e 10 anos com Gestão de Pessoas");
        Departamento departamento = new Departamento("Projetos",  50);
        Empresa empresa = new Empresa("BiluTech",  departamento, ceo);

        empresa.mostrarInformacoes();
        ceo.mostrarInformacoes();
        departamento.mostrarInformacoes();
    }
}
