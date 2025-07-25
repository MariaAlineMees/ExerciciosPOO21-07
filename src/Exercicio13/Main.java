package Exercicio13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Quarto> quartos = new ArrayList<>();
        quartos.add(new Quarto(1,"101", "Standard", "Ocupado",100.00));
        quartos.add(new Quarto(2,"201", "Premium", "Livre",200.00));
        quartos.add(new Quarto(3,"301", "Luxo", "Reservado",300.00));

        Endereco endereco = new Endereco("Rua do Sol", "56345012","Bairro Matilde", "Xicoria", 46);

        Hotel hotel = new Hotel("Durma Bem", "99999-9999", "durmabem@gmail.com", "23458123740001", endereco, quartos);

        hotel.exibirHotel();
        endereco.exibirEndereco();
        hotel.exibirQuartos();



    }
}
