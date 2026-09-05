import model.*;
import service.*;
import exception.EstoqueInsuficienteException;

public class Main {
    public static void main(String[] args) {
        // Criando produtos (um físico, um digital)
        ProdutoFisico notebook = new ProdutoFisico("Notebook", 3500.00, "P001", 10, 2.5);
        ProdutoFisico mouse = new ProdutoFisico("Mouse", 80.00, "P002", 50, 0.2);
        ProdutoDigital ebook = new ProdutoDigital("E-book Java", 39.90, "P003", 100, "http://loja.com/ebook");

        // Criando cliente
        Cliente cliente = new Cliente("Maria", "maria@email.com");

        // Escolhendo a estratégia de frete
        CalculadoraFrete calculadoraFrete = new FretePorPeso(8.0);

        try {
            // Montando o carrinho
            cliente.getCarrinho().adicionarItem(notebook, 1);
            cliente.getCarrinho().adicionarItem(mouse, 2);
            cliente.getCarrinho().adicionarItem(ebook, 1);

            System.out.println("Itens no carrinho:");
            cliente.getCarrinho().listarItens();
            System.out.println();

            // Fechando o pedido
            Pedido pedido = new Pedido(cliente, calculadoraFrete);
            pedido.gerarRecibo();

            // Tentando comprar mais do que tem em estoque (deve falhar)
            System.out.println("\nTentando comprar mais notebooks do que o estoque permite...");
            cliente.getCarrinho().adicionarItem(notebook, 999);

        } catch (EstoqueInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}