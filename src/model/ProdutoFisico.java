package model;

public class ProdutoFisico extends Produto {
    private double peso;

    public ProdutoFisico(String nome, double preco, String codigo, int quantidadeEmEstoque, double peso) {
        super(nome, preco, codigo, quantidadeEmEstoque);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return super.toString() + " [Físico, " + peso + "kg]";
    }
}