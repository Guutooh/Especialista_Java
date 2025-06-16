package Modulo_05_Orientacao_a_objetos.Aula_05_25_Desafio_composicao_de_objetos_e_metodos.Desafio_1;

public class FolhaPagamento {

    double calcularSalario(int horasNormais, int horasExtras,
                           double valorHoraNormal, double valorHoraExtra) {

        double valorHorasNormais = horasNormais * valorHoraNormal;
        double valorHorasExtras = horasExtras * valorHoraExtra;

        return valorHorasNormais + valorHorasExtras;
    }

}
