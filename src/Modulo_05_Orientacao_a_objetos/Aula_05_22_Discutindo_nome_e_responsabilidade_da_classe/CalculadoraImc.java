package Modulo_05_Orientacao_a_objetos.Aula_05_22_Discutindo_nome_e_responsabilidade_da_classe;

public class CalculadoraImc {

    double peso;
    double altura;

    IndiceMassaCorporal calcular() {

        IndiceMassaCorporal imc = new IndiceMassaCorporal();

        imc.resultado = peso / (altura * altura);
        imc.peso = peso;
        imc.altura = altura;

        return imc;
    }

}
