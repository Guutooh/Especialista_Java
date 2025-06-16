package Modulo_06_boas_praticas_e_codigo_limpo.Aula_06_04_Codigo_Limpo_comentarios_no_codigo;

public class Contribuinte {

    // Conforme Lei XYZ
    static final int IDADE_MINIMA_APOSENTADORIA = 65;

    int idade;
    int tempoContribuicaoEmAnos;

    boolean estaElegivelParaAposentadoria() {
        return idade >= IDADE_MINIMA_APOSENTADORIA;
    }

}
