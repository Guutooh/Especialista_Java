package Aula_05_23_Metodos_com_argumentos;

public class CalculadoraImc {

    IndiceMassaCorporal calcular(double peso, double altura) {

        IndiceMassaCorporal imc = new IndiceMassaCorporal();

        imc.resultado = peso / (altura * altura);
        imc.peso = peso;
        imc.altura = altura;

        return imc;
    }

}
