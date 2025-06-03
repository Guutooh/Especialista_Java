package Aula_05_25_Desafio_composicao_de_objetos_e_metodos.Desafio_3;

public class Holerite {

    Funcionario funcionario;
    double valorTotalHorasNormais;
    double valorTotalHorasExtras;
    double adicionalParaFilhos;

    double calcularValorTotal() {
        return valorTotalHorasNormais + valorTotalHorasExtras + adicionalParaFilhos;
    }

    void imprimir() {
        System.out.println("HOLERITE");
        System.out.println("-----------------");
        System.out.printf("Nome do funcionário: %s%n", funcionario.nome);
        System.out.printf("Valor das horas normais: R$ %.2f%n", valorTotalHorasNormais);
        System.out.printf("Valor das horas extras: R$ %.2f%n", valorTotalHorasExtras);
        System.out.printf("Adicional para filhos: R$ %.2f%n", adicionalParaFilhos);
        System.out.printf("Valor total: R$ %.2f%n", calcularValorTotal());
    }

}
