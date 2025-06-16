package Modulo_07_Wrappers_e_boxing.Aula_07_04_Comparando_wrappers;

public class Principal {

    public static void main(String[] args) {
        Integer numero1 = 128;
        Integer numero2 = 128;
        Short numero3 = 128;

        System.out.println(numero1.equals(numero2));
        System.out.println(numero1.intValue() == numero3.intValue());
    }

}
