package Aula_05_30_Usando_a_palavra_chave_this;

public class ServicoDePrecificacao {

    void definirPrecoVenda(Produto produto, double percentualMargemLucro) {

        produto.precoVenda = produto.precoCusto * ((percentualMargemLucro / 100) + 1);
    }

}
