package Modulo_05_Orientacao_a_objetos.Aula_05_21_Refatorando_para_tornar_uma_classe_mais_rica;

public class Principal {

    public static void main(String[] args) {

        Paciente paciente = new Paciente();

        paciente.altura = 1.82;
        paciente.peso = 175;

        IndiceMassaCorporal imc = paciente.calcularIndiceMassaCorporal();

        if (imc.estaComObesidade()) {

            System.out.printf("Paciente com altura de %.2f e peso de %.2f " +
                    "está com obesidade%n", imc.altura, imc.peso);
        }

        System.out.printf("IMC: %.2f%n", imc.resultado);
    }

}
