package Modulo_05_Orientacao_a_objetos.Aula_05_25_Desafio_composicao_de_objetos_e_metodos.Desafio_2;

public class FolhaPagamento {

    double calcularSalario(int horasNormais, int horasExtras, ContratoTrabalho contrato) {

        double valorHorasNormais = horasNormais * contrato.valorHoraNormal;
        double valorHorasExtras = horasExtras * contrato.valorHoraExtra;

        double valorTotal = valorHorasNormais + valorHorasExtras;

        if (contrato.possuiAdicionalParaFilhos()) {
            valorTotal *= 1.10;
        }

        return valorTotal;
    }

}
