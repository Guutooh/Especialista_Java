package Modulo_05_Orientacao_a_objetos.Aula_05_39_Inferencia_de_tipo_de_variavel_local;

public class CadastroPortaria {

    static final int TEMPO_EXPIRACAO_PADRAO_EM_MESES = 1;

    void cadastrar(final Visitante visitante) {
        this.cadastrar(visitante, TEMPO_EXPIRACAO_PADRAO_EM_MESES);
    }

    int cadastrar(final Visitante visitante, final int tempoExpiracaoEmMeses) {
        final var tempoExpiracaoEmDias = tempoExpiracaoEmMeses * 30;

        System.out.printf("Visitante %s cadastrado para %d dias%n",
                visitante.nome, tempoExpiracaoEmDias);

        return 1;
    }

}
