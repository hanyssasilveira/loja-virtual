package model;

import java.util.ArrayList;
import java.util.List;
import exception.EstoqueInsuficienteException;

public class Carrinho {
    private List<ItemCarrinho> itens;

    public Carrinho() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto, int quantidade) throws EstoqueInsuficienteException {
        if (quantidade > produto.getQuantidadeEmEstoque()) {
            throw new EstoqueInsuficienteException(
                "Estoque insuficiente para " + produto.getNome() +
                ". Disponível: " + produto.getQuantidadeEmEstoque() + ", solicitado: " + quantidade
            );
        }
        ItemCarrinho item = new ItemCarrinho(produto, quantidade);
        itens.add(item);
        produto.reduzirEstoque(quantidade);
    }

    public void removerItem(ItemCarrinho item) {
        itens.remove(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemCarrinho item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    public List<ItemCarrinho> getItens() {
        return itens;
    }

    public void esvaziar() {
        itens.clear();
    }

    public void listarItens() {
        for (ItemCarrinho item : itens) {
            System.out.println(item);
        }
    }
}