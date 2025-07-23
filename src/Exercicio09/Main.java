package Exercicio09;

public class Main {
    public static void main(String[] args) {

        Habilidade basica = new Habilidade("Bola de Fogo", "Magia", 50,"Lança uma bola flamejante");
        Habilidade especial = new Habilidade("Chuva de Meteoros", "Magia", 80,"Invoca uma chuva devastadora de pedras flamejantes");


        Categoria mago = new Categoria("Mago", basica, especial);


        Personagem personagem = new Personagem("Cristalina", 12, mago);


        personagem.exibirStatus();
        personagem.usarHabilidade();
    }
}
