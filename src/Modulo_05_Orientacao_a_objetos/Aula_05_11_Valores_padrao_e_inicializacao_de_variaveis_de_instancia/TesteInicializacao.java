package Modulo_05_Orientacao_a_objetos.Aula_05_11_Valores_padrao_e_inicializacao_de_variaveis_de_instancia;

public class TesteInicializacao {

    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.fabricante = "Honda";
        meuCarro.anoFabricacao = 2021;

        System.out.println(meuCarro.fabricante);
        System.out.println(meuCarro.modelo);
        System.out.println(meuCarro.anoFabricacao);
    }

}
