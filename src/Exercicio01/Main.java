package Exercicio01;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Endereco enderecoPessoa = new Endereco("Rua das Flores", "89012-345", "Velha", "Blumenau");
        Pessoa pessoa = new Pessoa("Cristina Paiva", 1, "01/01/1990", "cristina@gmail.com", "123.456.789-00", enderecoPessoa);
        Produto produto = new Produto("Café Gourmet", 19.99);
        Endereco enderecoEntrega = new Endereco("Rua das Palmeiras", "89010-000", "Itoupava", "Blumenau");
        Pedido pedido = new Pedido(pessoa, enderecoEntrega, produto, 2, new Date(), produto.getPreco() * 2);

        pedido.exibirDados();


    }
}