package Exercicio05;

public class Main {
    public static void main(String[] args) {

        Chip chip = new Chip("Intel", "E-sim", "999999999");
        Operadora operadora = new Operadora("Vivo", "47");
        Telefone telefone = new Telefone("Apple",  "Iphone 12", "Rosa", chip, operadora);
        telefone.exibirInformacoes();
        chip.exibirInformacoes();
        operadora.exibirInformacoes();

    }
}
