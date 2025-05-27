package Aula_05_20_Metodos_que_retornam_objetos;

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
