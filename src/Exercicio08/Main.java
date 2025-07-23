package Exercicio08;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("ViaBrasil");
        Cliente cliente = new Cliente(1, "Fransciso Amorim", "1987-08-12", "fransciso@gmail.com", "123.456.789-00");
        ContaBancaria contaBancaria = new ContaBancaria("123", "456", 1000, cliente);

        banco.mostrarInformacoes();
        cliente.mostrarInformacoes();
        contaBancaria.mostrarInformacoes();

    }
}
