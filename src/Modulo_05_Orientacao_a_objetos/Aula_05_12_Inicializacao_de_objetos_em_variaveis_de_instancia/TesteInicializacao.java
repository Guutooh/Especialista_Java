package Modulo_05_Orientacao_a_objetos.Aula_05_12_Inicializacao_de_objetos_em_variaveis_de_instancia;

public class TesteInicializacao {

    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.fabricante = "Honda";
        meuCarro.anoFabricacao = 2021;
        meuCarro.proprietario.nome = "Maria";

        Pessoa proprietarioAntigo = meuCarro.proprietario;

        meuCarro.proprietario = new Pessoa();

        System.out.println(meuCarro.fabricante);
        System.out.println(meuCarro.modelo);
        System.out.println(meuCarro.anoFabricacao);
        System.out.println(meuCarro.proprietario.nome);
    }

}
