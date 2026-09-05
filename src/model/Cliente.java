package model;

public class Cliente {
    private String nome;
    private String email;
    private Carrinho carrinho;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.carrinho = new Carrinho();
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }
}