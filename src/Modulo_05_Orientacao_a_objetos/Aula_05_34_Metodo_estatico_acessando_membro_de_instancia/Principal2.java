package Modulo_05_Orientacao_a_objetos.Aula_05_34_Metodo_estatico_acessando_membro_de_instancia;

public class Principal2 {

    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        Produto.alterarCustoEmbalagem(12);

        Produto.imprimirCustoEmbalagem();
    }

}
