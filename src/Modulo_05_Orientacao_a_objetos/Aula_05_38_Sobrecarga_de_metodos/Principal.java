package Modulo_05_Orientacao_a_objetos.Aula_05_38_Sobrecarga_de_metodos;

public class Principal {

    public static void main(String[] args) {

        Visitante novoVisitante = new Visitante();

        novoVisitante.nome = "João";
        novoVisitante.idade = 15;

        CadastroPortaria cadastroPortaria = new CadastroPortaria();
//        cadastroPortaria.cadastrar(novoVisitante);
        cadastroPortaria.cadastrar(novoVisitante, 2);
    }

}
