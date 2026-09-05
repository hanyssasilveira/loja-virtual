package service;

import model.ProdutoFisico;

public class FretePorPeso implements CalculadoraFrete {
    private double valorPorKg;

    public FretePorPeso(double valorPorKg) {
        this.valorPorKg = valorPorKg;
    }

    @Override
    public double calcular(ProdutoFisico produto, int quantidade) {
        return produto.getPeso() * quantidade * valorPorKg;
    }
}