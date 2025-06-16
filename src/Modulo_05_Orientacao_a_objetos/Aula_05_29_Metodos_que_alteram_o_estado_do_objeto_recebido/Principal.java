package Modulo_05_Orientacao_a_objetos.Aula_05_29_Metodos_que_alteram_o_estado_do_objeto_recebido;

public class Principal {

    public static void main(String[] args) {

        Produto novoProduto = new Produto();

        novoProduto.precoCusto = 100;

        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();

        servicoDePrecificacao.definirPrecoVenda(novoProduto, 30);

        System.out.printf("Preço de venda: %.2f%n", novoProduto.precoVenda);
    }

}
