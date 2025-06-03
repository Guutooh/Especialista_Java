package Aula_05_24_Passando_objetos_como_argumentos_de_metodos;

public class CalculadoraImc {

    IndiceMassaCorporal calcular(Paciente paciente) {

        IndiceMassaCorporal imc = new IndiceMassaCorporal();

        imc.resultado = paciente.peso / (paciente.altura * paciente.altura);
        imc.peso = paciente.peso;
        imc.altura = paciente.altura;

        return imc;
    }

}
