package Modulo_05_Orientacao_a_objetos.Aula_05_31_Atributos_de_classe_com_o_modificador_static;

public class ServicoDePrecificacao {

    void definirPrecoVenda(Produto produto, double percentualMargemLucro) {

        double precoVendaCalculado = produto.precoCusto * ((percentualMargemLucro / 100) + 1);

        precoVendaCalculado += Produto.custoEmbalagem;

        produto.precoVenda = precoVendaCalculado;
    }

}
