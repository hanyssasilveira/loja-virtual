package model;

import service.CalculadoraFrete;
import java.time.LocalDate;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<ItemCarrinho> itens;
    private double frete;
    private LocalDate dataPedido;

    public Pedido(Cliente cliente, CalculadoraFrete calculadoraFrete) {
        this.cliente = cliente;
        this.itens = cliente.getCarrinho().getItens();
        this.dataPedido = LocalDate.now();
        this.frete = calcularFreteTotal(calculadoraFrete);
    }

    private double calcularFreteTotal(CalculadoraFrete calculadoraFrete) {
        double totalFrete = 0;
        for (ItemCarrinho item : itens) {
            if (item.getProduto() instanceof ProdutoFisico produtoFisico) {
                totalFrete += calculadoraFrete.calcular(produtoFisico, item.getQuantidade());
            }
        }
        return totalFrete;
    }

    public double calcularTotalProdutos() {
        double total = 0;
        for (ItemCarrinho item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    public double calcularTotalGeral() {
        return calcularTotalProdutos() + frete;
    }

    public void gerarRecibo() {
        System.out.println("===== RECIBO =====");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Data: " + dataPedido);
        System.out.println("-------------------");
        for (ItemCarrinho item : itens) {
            System.out.println(item);
        }
        System.out.println("-------------------");
        System.out.println("Subtotal produtos: R$ " + calcularTotalProdutos());
        System.out.println("Frete: R$ " + frete);
        System.out.println("TOTAL: R$ " + calcularTotalGeral());
        System.out.println("===================");
    }
}