# 🛒 Loja Virtual — Projeto Java POO

Sistema de loja virtual desenvolvido em Java para praticar os principais conceitos de Programação Orientada a Objetos.

## 💡 Sobre o projeto

Simula o fluxo de uma compra online: cadastro de produtos, carrinho de compras, cálculo de frete e geração de recibo — com controle de estoque e tratamento de erros.

## 🧠 Conceitos de POO aplicados

- **Encapsulamento**: atributos privados com acesso controlado via getters e métodos de negócio (ex: `reduzirEstoque()`)
- **Herança**: `ProdutoFisico` e `ProdutoDigital` estendem `Produto`
- **Polimorfismo**: o `Carrinho` trabalha com qualquer subtipo de `Produto` sem precisar saber qual é
- **Interfaces**: `CalculadoraFrete` permite trocar a estratégia de frete (`FreteFixo`, `FretePorPeso`) sem alterar o restante do sistema
- **Composição**: `ItemCarrinho` combina um `Produto` com uma quantidade; `Carrinho` agrega vários `ItemCarrinho`
- **Exceções customizadas**: `EstoqueInsuficienteException` impede vendas acima do estoque disponível

## 🗂️ Estrutura do projeto

src/
├── Main.java
├── model/
│ ├── Produto.java
│ ├── ProdutoFisico.java
│ ├── ProdutoDigital.java
│ ├── ItemCarrinho.java
│ ├── Carrinho.java
│ ├── Cliente.java
│ └── Pedido.java
├── service/
│ ├── CalculadoraFrete.java
│ ├── FreteFixo.java
│ └── FretePorPeso.java
└── exception/
└── EstoqueInsuficienteException.java


## ▶️ Como executar

```bash
git clone <url-do-repositorio>
cd loja-virtual
javac -d out src/Main.java src/model/*.java src/service/*.java src/exception/*.java
java -cp out Main
```

Ou abra o projeto no VS Code (com a extensão *Extension Pack for Java*) e rode `Main.java` diretamente.

## 🚀 Possíveis evoluções futuras

- Persistência em banco de dados
- Exposição como API REST (Spring Boot)
- Testes automatizados com JUnit
- Interface web (front-end)

## 👩‍💻 Autora

Desenvolvido como parte da jornada de estudos para me tornar desenvolvedora full stack.
