package service;

import model.ProdutoFisico;

public class FreteFixo implements CalculadoraFrete {
    private double valorFixo;

    public FreteFixo(double valorFixo) {
        this.valorFixo = valorFixo;
    }

    @Override
    public double calcular(ProdutoFisico produto, int quantidade) {
        return valorFixo;
    }
}