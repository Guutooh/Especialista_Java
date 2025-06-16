package Modulo_05_Orientacao_a_objetos.Aula_05_37_Modificador_final_em_variaveis_locais;

public class Visitante {

    static final int IDADE_MINIMA_ACESSO_IRRESTRITO = 16;

    String nome;
    int idade;

    boolean possuiAcessoRestritoPorIdade() {
        return idade < IDADE_MINIMA_ACESSO_IRRESTRITO;
    }

}
