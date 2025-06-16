package Modulo_05_Orientacao_a_objetos.Aula_05_37_Modificador_final_em_variaveis_locais;

public class CadastroPortaria {

    void cadastrar(final Visitante visitante, final int tempoExpiracaoEmMeses) {

        final int tempoExpiracaoEmDias = tempoExpiracaoEmMeses * 30;

        System.out.printf("Visitante %s cadastrado para %d dias%n", visitante.nome, tempoExpiracaoEmDias);
    }

}
