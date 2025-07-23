package Exercicio06;

public class Main {
    public static void main(String[] args) {

        Dono dono = new Dono("Juciela Thiago", "123.456.789-00", "juciela@gmail", "123.456.789-00");
        Veterinario veterinario = new Veterinario("Diogo Fonseca", "(47) 99999-9999");
        Cachorro cachorro = new Cachorro("Rex", "Golden Retriever", 5, "Amarelo", dono, veterinario);

        dono.mostrarInformacoes();
        veterinario.mostrarInformacoes();
        cachorro.mostrarInformacoes();

    }
}
