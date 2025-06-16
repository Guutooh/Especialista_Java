package Modulo_05_Orientacao_a_objetos.Aula_05_25_Desafio_composicao_de_objetos_e_metodos.Desafio_3;

public class FolhaPagamento {

    Holerite calcularSalario(int horasNormais, int horasExtras, ContratoTrabalho contrato) {

        Holerite holerite = new Holerite();

        holerite.funcionario = contrato.funcionario;

        holerite.valorTotalHorasNormais = horasNormais * contrato.valorHoraNormal;

        holerite.valorTotalHorasExtras = horasExtras * contrato.valorHoraExtra;

        double subtotal = holerite.valorTotalHorasNormais + holerite.valorTotalHorasExtras;

        if (contrato.possuiAdicionalParaFilhos()) {
            holerite.adicionalParaFilhos = subtotal * 0.10;
        }

        return holerite;
    }

}
