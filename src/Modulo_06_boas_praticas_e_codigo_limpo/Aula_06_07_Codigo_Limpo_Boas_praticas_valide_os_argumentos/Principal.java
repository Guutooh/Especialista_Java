package Modulo_06_boas_praticas_e_codigo_limpo.Aula_06_07_Codigo_Limpo_Boas_praticas_valide_os_argumentos;

public class Principal {

    public static void main(String[] args) {
        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();

        Produto produto = new Produto();
        produto.nome = "Água";
        produto.precoUnitario = 5;

        carrinho.adicionarItem(produto, 4);

        Endereco endereco = new Endereco();
        endereco.logradouro = "Rua das Amoras";
        endereco.numero = "1000";
        endereco.bairro = "Centro";

        carrinho.gerarPedido();

        System.out.println("Pedido gerado");
    }

}
