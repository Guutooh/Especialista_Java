package Modulo_05_Orientacao_a_objetos.Aula_05_31_Atributos_de_classe_com_o_modificador_static;

public class Principal2 {

    public static void main(String[] args) {

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        Produto.custoEmbalagem = 20;

//        produto1.custoEmbalagem = 10;
//        produto2.custoEmbalagem = 15;

        produto1.imprimirCustoEmbalagem();
        produto2.imprimirCustoEmbalagem();
    }

}
