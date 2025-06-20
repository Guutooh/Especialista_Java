package Modulo_05_Orientacao_a_objetos.Aula_05_23_Metodos_com_argumentos;

public class Principal {

    public static void main(String[] args) {

        CalculadoraImc calculadoraImc = new CalculadoraImc();

        double peso = 175;
        double altura = 1.82;

        IndiceMassaCorporal imc = calculadoraImc.calcular(peso, altura);

        if (imc.estaComObesidade()) {
            System.out.printf("Paciente com altura de %.2f e peso de %.2f " +
                    "está com obesidade%n", imc.altura, imc.peso);
        }

        System.out.printf("IMC: %.2f%n", imc.resultado);
    }

}
