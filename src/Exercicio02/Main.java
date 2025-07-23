package Exercicio02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Carro> listaCarros = new ArrayList<>();

        Motor motor1 = new Motor(1600, 120, "Gasolina");
        Fabricante fabricante1 = new Fabricante("Honda", "Japão", 1948);
        Carro carro1 = new Carro("Civic", 2023, "Prata", motor1, fabricante1);

        Motor motor2 = new Motor(2000, 150, "Flex");
        Fabricante fabricante2 = new Fabricante("Toyota", "Japão", 1937);
        Carro carro2 = new Carro("Corolla", 2022, "Preto", motor2, fabricante2);

        listaCarros.add(carro1);
        listaCarros.add(carro2);


        for (Carro carro : listaCarros) {
            System.out.println("---------");
            carro.exibirDados();

        }
    }
}
