package Aula_05_25_Desafio_composicao_de_objetos_e_metodos.Desafio_3;

public class ContratoTrabalho {

    Funcionario funcionario;
    double valorHoraNormal;
    double valorHoraExtra;

    boolean possuiAdicionalParaFilhos() {
        return funcionario.possuiFilhos();
    }

}
