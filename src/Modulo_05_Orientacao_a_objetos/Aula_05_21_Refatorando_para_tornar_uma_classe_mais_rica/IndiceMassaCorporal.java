package Modulo_05_Orientacao_a_objetos.Aula_05_21_Refatorando_para_tornar_uma_classe_mais_rica;

public class IndiceMassaCorporal {

    double resultado;
    double peso;
    double altura;

    boolean estaComObesidade() {
        return resultado >= 30;
    }

    boolean estaAbaixoDoPesoIdeal() {
        return resultado < 18.5;
    }

}
