package Aula_05_25_Desafio_composicao_de_objetos_e_metodos.Desafio_1;

public class Principal {

    public static void main(String[] args) {

        FolhaPagamento folhaPagamento = new FolhaPagamento();

        double salarioDevido = folhaPagamento.calcularSalario(160, 10,
                51.8, 60.5);

        System.out.printf("Salário devido: R$ %.2f%n", salarioDevido);
    }

}
