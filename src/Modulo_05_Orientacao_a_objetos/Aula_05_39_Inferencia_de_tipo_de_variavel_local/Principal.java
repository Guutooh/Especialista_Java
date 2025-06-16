package Modulo_05_Orientacao_a_objetos.Aula_05_39_Inferencia_de_tipo_de_variavel_local;

public class Principal {

    public static void main(String[] args) {
        var novoVisitante = new Visitante();

        novoVisitante.nome = "João";
        novoVisitante.idade = 15;

        var cadastroPortaria = new CadastroPortaria();
//        var codigoVisitante = cadastroPortaria.cadastrar(novoVisitante, 2);
        int codigoVisitante = cadastroPortaria.cadastrar(novoVisitante, 2);
    }

}
