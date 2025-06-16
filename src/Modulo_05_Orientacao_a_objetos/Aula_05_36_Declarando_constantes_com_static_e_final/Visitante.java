package Modulo_05_Orientacao_a_objetos.Aula_05_36_Declarando_constantes_com_static_e_final;

public class Visitante {

    static final int IDADE_MINIMA_ACESSO_IRRESTRITO = 16;

    String nome;
    int idade;

    boolean possuiAcessoRestritoPorIdade() {
        return idade < IDADE_MINIMA_ACESSO_IRRESTRITO;
    }

}
