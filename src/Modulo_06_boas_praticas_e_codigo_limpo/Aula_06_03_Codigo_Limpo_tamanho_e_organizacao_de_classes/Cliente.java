package Modulo_06_boas_praticas_e_codigo_limpo.Aula_06_03_Codigo_Limpo_tamanho_e_organizacao_de_classes;

public class Cliente {

    static final double TAXA_LIMITE_CREDITO = 0.10;
    static final double LIMITE_CREDITO_MINIMO = 10_000;

    String razaoSocial;
    double faturamentoAnual;

    double calcularLimiteCredito() {
        double limiteCredito = faturamentoAnual * TAXA_LIMITE_CREDITO;

        if (limiteCredito < LIMITE_CREDITO_MINIMO) {
            limiteCredito = LIMITE_CREDITO_MINIMO;
        }

        return limiteCredito;
    }

}
