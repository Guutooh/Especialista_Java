package Modulo_05_Orientacao_a_objetos.Aula_05_37_Modificador_final_em_variaveis_locais;

public class Principal {

    public static void main(String[] args) {

        Visitante novoVisitante = new Visitante();

        novoVisitante.nome = "João";
        novoVisitante.idade = 15;

        CadastroPortaria cadastroPortaria = new CadastroPortaria();

        cadastroPortaria.cadastrar(novoVisitante, 10);
    }

}
