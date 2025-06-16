package Modulo_05_Orientacao_a_objetos.Aula_05_34_Metodo_estatico_acessando_membro_de_instancia;

public class ServicoDePrecificacao {

    void definirPrecoVenda(Produto produto, double percentualMargemLucro) {
        // poderia ter cálculos muito mais complexos aqui

        double precoVendaCalculado = Matematica.calcularAcrescimo(
                produto.precoCusto, percentualMargemLucro);

        precoVendaCalculado += Produto.custoEmbalagem;

        produto.precoVenda = precoVendaCalculado;
    }

}
