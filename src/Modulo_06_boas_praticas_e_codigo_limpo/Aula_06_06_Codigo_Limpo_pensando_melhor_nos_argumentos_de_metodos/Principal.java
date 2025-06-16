package Modulo_06_boas_praticas_e_codigo_limpo.Aula_06_06_Codigo_Limpo_pensando_melhor_nos_argumentos_de_metodos;

public class Principal {

    public static void main(String[] args) {
        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
//        carrinho.adicionarItem("Água", 5, 4);

        Produto produto = new Produto();
        produto.nome = "Água";
        produto.precoUnitario = 5;

        carrinho.adicionarItem(produto, 4);

//        produto.alterarStatus(true);
        produto.ativar();
        produto.inativar();
    }

}
