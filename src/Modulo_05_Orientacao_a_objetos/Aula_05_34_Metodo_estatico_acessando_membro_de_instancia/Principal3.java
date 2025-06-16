package Modulo_05_Orientacao_a_objetos.Aula_05_34_Metodo_estatico_acessando_membro_de_instancia;

public class Principal3 {

    public static void main(String[] args) {
        Produto.alterarCustoEmbalagem(10);

        Produto produto = new Produto();
        produto.alterarPrecoCusto(100);

        System.out.printf("Total de custos: %.2f%n",
                Produto.calcularCustosTotais(produto));
    }

}
