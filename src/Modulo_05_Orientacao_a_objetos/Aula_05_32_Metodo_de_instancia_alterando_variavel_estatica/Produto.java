package Modulo_05_Orientacao_a_objetos.Aula_05_32_Metodo_de_instancia_alterando_variavel_estatica;

public class Produto {

    static double custoEmbalagem;

    double precoCusto;
    double precoVenda;

    void alterarCustoEmbalagem(double custoEmbalagem) {
        Produto.custoEmbalagem = custoEmbalagem;
    }

    void alterarPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    void imprimirCustoEmbalagem() {
        System.out.printf("Custo com embalagem: %.2f%n", Produto.custoEmbalagem);
    }

}
