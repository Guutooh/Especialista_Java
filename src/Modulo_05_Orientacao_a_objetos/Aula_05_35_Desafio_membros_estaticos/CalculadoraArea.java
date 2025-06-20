package Modulo_05_Orientacao_a_objetos.Aula_05_35_Desafio_membros_estaticos;

public class CalculadoraArea {

    static final double PI = 3.14159265358979323846;

    public static double calcularAreaQuadrado(double medidaDoLado) {
        return medidaDoLado * medidaDoLado;
    }

    public static double calcularAreaCirculo(double raio) {
        return raio * raio * CalculadoraArea.PI;
    }

}
