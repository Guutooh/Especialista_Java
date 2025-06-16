package Modulo_07_Wrappers_e_boxing.Aula_07_05_Desafio_wrappers_e_boxing;

public class Principal {

    public static void main(String[] args) {

        Televisor tv = new Televisor();

        // Não deveria mudar o volume e canal
        tv.mudarVolume(20);
        tv.mudarCanal(130);

        // Deveria mudar o volume e canal
        tv.mudarVolume(300);
        tv.mudarCanal(10);
    }

}
