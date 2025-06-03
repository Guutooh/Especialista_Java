package Aula_05_21_Refatorando_para_tornar_uma_classe_mais_rica;

public class Paciente {

    double peso;
    double altura;

    IndiceMassaCorporal calcularIndiceMassaCorporal() {

        IndiceMassaCorporal imc = new IndiceMassaCorporal();

        imc.resultado = peso / (altura * altura);
        imc.peso = peso;
        imc.altura = altura;

        return imc;
    }

}
