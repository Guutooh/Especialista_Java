package Modulo_06_boas_praticas_e_codigo_limpo.Aula_06_06_Codigo_Limpo_pensando_melhor_nos_argumentos_de_metodos;

public class Produto {

    String nome;
    double precoUnitario;
    boolean ativo;

    void alterarStatus(boolean ativo) {
        if (ativo) {
            System.out.println("Ativando");
        } else {
            System.out.println("Desativando");
        }

        this.ativo = ativo;
    }

    void ativar() {
        System.out.println("Ativando");
        this.ativo = true;
    }

    void inativar() {
        System.out.println("Desativando");
        this.ativo = false;
    }

}
