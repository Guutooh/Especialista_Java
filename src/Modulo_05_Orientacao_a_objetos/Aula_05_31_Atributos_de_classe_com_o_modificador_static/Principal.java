package Modulo_05_Orientacao_a_objetos.Aula_05_31_Atributos_de_classe_com_o_modificador_static;

public class Principal {

    public static void main(String[] args) {

        Produto.custoEmbalagem = 10;

        Produto novoProduto = new Produto();

        novoProduto.alterarPrecoCusto(100);

        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();

        servicoDePrecificacao.definirPrecoVenda(novoProduto, 20);

        System.out.printf("Preço de custo: %.2f%n", novoProduto.precoCusto);
        System.out.printf("Preço de venda: %.2f%n", novoProduto.precoVenda);
    }

}
