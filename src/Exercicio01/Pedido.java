package Exercicio01;

import java.util.Date;

public class Pedido {

    private Pessoa pessoa;
    private Endereco enderecoEntrega;
    private Produto produto;
    private int quantidade;
    private Date dataPedido;
    private double valorTotal;

    public Pedido(Pessoa pessoa, Endereco enderecoEntrega, Produto produto, int quantidade, Date dataPedido, double valorTotal) {
        this.pessoa = pessoa;
        this.enderecoEntrega = enderecoEntrega;
        this.produto = produto;
        this.quantidade = quantidade;
        this.dataPedido = dataPedido;
        this.valorTotal = valorTotal;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Endereco getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(Endereco enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void exibirDados() {
        System.out.println("===== RESUMO DO PEDIDO =====");
        System.out.println("Cliente: " + pessoa.getNome());
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor Total: R$ " + valorTotal);
        System.out.println("Endereço de entrega: " + enderecoEntrega.getRua() +
                ", Bairro: " + enderecoEntrega.getBairro() +
                ", Cidade: " + enderecoEntrega.getCidade() +
                ", CEP: " + enderecoEntrega.getCep());


    }
}