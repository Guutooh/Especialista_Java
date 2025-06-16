package Modulo_07_Wrappers_e_boxing.Aula_07_06_Boas_praticas_prefira_tipos_primitivos_a_wrappers;

public class Principal3 {

    public static void main(String[] args) {

        long tempoInicio = System.currentTimeMillis();

        // long soma = 0L;
        Long soma = 0L;

        for (long i = 0; i< Integer.MAX_VALUE; i++) {
            soma = soma + i;
        }

        System.out.println(soma);

        double duracao = (System.currentTimeMillis() - tempoInicio) / 1000d;
        System.out.printf("Duração: %.2fs%n", duracao);
    }

}
