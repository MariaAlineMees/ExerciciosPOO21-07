package Exercicio10;

import Exercicio02.Fabricante;
import Exercicio04.Marca;

public class Main {
    public static void main(String[] args) {
        Marca marca = new Marca("IntelMotores", 1);
        Motor motor = new Motor("XPower900", 6, 101, 3.2, marca);
        Fabricante fabricante = new Fabricante("MontCar", "Brasil", 1995);
        Proprietario proprietario = new Proprietario("Juciela Preis", "123.456.789-00", "(47) 99999-9999");

        Carro carro = new Carro("Thunderbolt", 2024, "Vermelho", motor, fabricante, proprietario);
        carro.exibirInformacoes();
    }
}