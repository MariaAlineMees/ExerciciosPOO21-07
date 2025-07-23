package Exercicio04;


public class Main {
    public static void main(String[] args) {
        Marca marca = new Marca("Intel", 1);
        Processador processador = new Processador("i7-11700", 8, 101, 3.6, marca);
        Computador computador = new Computador("PC Gamer", "Dell G5", 2023, processador);

        computador.exibirDados();
    }


}


