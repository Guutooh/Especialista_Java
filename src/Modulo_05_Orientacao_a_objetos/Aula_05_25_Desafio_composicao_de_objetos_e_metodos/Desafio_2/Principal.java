package Modulo_05_Orientacao_a_objetos.Aula_05_25_Desafio_composicao_de_objetos_e_metodos.Desafio_2;

public class Principal {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.nome = "João da Silva";

        funcionario.quantidadeFilhos = 2;

        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();

        contratoTrabalho.funcionario = funcionario;

        contratoTrabalho.valorHoraNormal = 51.8;
        contratoTrabalho.valorHoraExtra = 60.5;

        FolhaPagamento folhaPagamento = new FolhaPagamento();

        double salarioDevido = folhaPagamento.calcularSalario(160, 10, contratoTrabalho);

        System.out.printf("Salário devido: R$ %.2f%n", salarioDevido);
    }

}
