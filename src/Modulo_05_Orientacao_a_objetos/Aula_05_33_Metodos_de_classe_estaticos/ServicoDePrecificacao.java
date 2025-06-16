package Modulo_05_Orientacao_a_objetos.Aula_05_33_Metodos_de_classe_estaticos;

public class ServicoDePrecificacao {

    void definirPrecoVenda(Produto produto, double percentualMargemLucro) {

        double precoVendaCalculado = Matematica.calcularAcrescimo(produto.precoCusto, percentualMargemLucro);

        precoVendaCalculado += Produto.custoEmbalagem;

        produto.precoVenda = precoVendaCalculado;
    }

}
