package model;

public class Produto {
    private String nome;
    private double preco;
    private String codigo;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, String codigo, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void reduzirEstoque(int quantidade) {
        this.quantidadeEmEstoque -= quantidade;
    }

    @Override
    public String toString() {
        return nome + " (R$ " + preco + ") - Estoque: " + quantidadeEmEstoque;
    }
}