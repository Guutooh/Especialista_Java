package Modulo_05_Orientacao_a_objetos.Aula_05_28_Metodos_que_alteram_o_valor_de_parametro_primitivo;

public class Principal {

    public static void main(String[] args) {

        double precoCompraFornecedor = 140;

        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();

        servicoDePrecificacao.calcularPrecoVenda(precoCompraFornecedor);

        System.out.printf("Preço: %.2f%n", precoCompraFornecedor);
    }

}
