package Modulo_05_Orientacao_a_objetos.Aula_05_39_Inferencia_de_tipo_de_variavel_local;

public class Visitante {

    static final int IDADE_MINIMA_ACESSO_IRRESTRITO = 16;

    String nome;
    int idade;

    boolean possuiAcessoRestritoPorIdade() {
        return idade < IDADE_MINIMA_ACESSO_IRRESTRITO;
    }

}
