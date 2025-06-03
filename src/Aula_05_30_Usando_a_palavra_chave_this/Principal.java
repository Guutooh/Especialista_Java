package Aula_05_30_Usando_a_palavra_chave_this;

public class Principal {

    public static void main(String[] args) {
        Produto novoProduto = new Produto();

        novoProduto.alterarPrecoCusto(80);

        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();

        servicoDePrecificacao.definirPrecoVenda(novoProduto, 20);

        System.out.printf("Preço de custo: %.2f%n", novoProduto.precoCusto);

        System.out.printf("Preço de venda: %.2f%n", novoProduto.precoVenda);
    }

}
