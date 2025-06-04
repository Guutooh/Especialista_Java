package Aula_05_31_Atributos_de_classe_com_o_modificador_static;

public class Produto {

    static double custoEmbalagem;
    double precoCusto;
    double precoVenda;

    void alterarPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    void imprimirCustoEmbalagem() {
        System.out.printf("Custo com embalagem: %.2f%n", Produto.custoEmbalagem);
    }

}
