package model;

public class ProdutoDigital extends Produto {
    private String linkDownload;

    public ProdutoDigital(String nome, double preco, String codigo, int quantidadeEmEstoque, String linkDownload) {
        super(nome, preco, codigo, quantidadeEmEstoque);
        this.linkDownload = linkDownload;
    }

    public String getLinkDownload() {
        return linkDownload;
    }

    @Override
    public String toString() {
        return super.toString() + " [Digital]";
    }
}