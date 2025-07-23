package Exercicio09;

public class Personagem {
    private String nome;
    private int nivel;
    private Categoria categoria;

    public Personagem(String nome, int nivel, Categoria categoria) {
        this.nome = nome;
        this.nivel = nivel;
        this.categoria = categoria;
    }

    public void usarHabilidade() {
        System.out.println("\n" + nome + " tenta usar suas habilidades...");
        categoria.getHabilidadeBasica().usar();
        if (nivel >= 10) {
            categoria.getHabilidadeEspecial().usar();
        } else {
            System.out.println("Habilidade especial disponível a partir do nível 10.");
        }
    }

    public void exibirStatus() {
        System.out.println("===== PERSONAGEM =====");
        System.out.println("Nome: " + nome);
        System.out.println("Nível: " + nivel);
        System.out.println("Classe: " + categoria.getNome());
        System.out.println("Habilidade básica: " + categoria.getHabilidadeBasica().getNome());
        System.out.println("Habilidade especial: " + categoria.getHabilidadeEspecial().getNome());
    }
}