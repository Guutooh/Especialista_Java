package Modulo_05_Orientacao_a_objetos.Aula_05_41_Desafio_sobregarga_de_metodos;

public class Principal {

    public static void main(String[] args) {
        System.out.println(NumeroUtil.descobrirMaior(10, 9));
        System.out.println(NumeroUtil.descobrirMaior(25, 21, 22));

        System.out.println(NumeroUtil.descobrirMaior(2.9, 1.8));
        System.out.println(NumeroUtil.descobrirMaior(30.0, 30.1, 20.4));
    }

}
