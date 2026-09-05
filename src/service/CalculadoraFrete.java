package service;

import model.ProdutoFisico;

public interface CalculadoraFrete {
    double calcular(ProdutoFisico produto, int quantidade);
}