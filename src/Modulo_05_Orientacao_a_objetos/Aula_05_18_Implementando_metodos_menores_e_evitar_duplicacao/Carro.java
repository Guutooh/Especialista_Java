package Modulo_05_Orientacao_a_objetos.Aula_05_18_Implementando_metodos_menores_e_evitar_duplicacao;

public class Carro {

    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    double precoCompra;
    Pessoa proprietario;

    void imprimirResumoDepreciacao() {

        double valorRevendaMeuCarro = calcularValorRevenda();
        int tempoDeUsoMeuCarro = calcularTempoDeUsoEmAnos();

        System.out.printf("Tempo de uso (anos): %d%n", tempoDeUsoMeuCarro);
        System.out.printf("Valor de revenda: %6.2f%n", valorRevendaMeuCarro);
    }

    double calcularIpva() {
        return calcularValorRevenda() * 0.04;
    }

    int calcularTempoDeUsoEmAnos() {
        return 2022 - anoFabricacao;
    }

    double calcularValorRevenda() {
        int tempoDeUsoEmAnos = calcularTempoDeUsoEmAnos();
        int vidaUtilEmAnos = 20;

        double valorRevenda = (precoCompra / vidaUtilEmAnos)
                * (vidaUtilEmAnos - tempoDeUsoEmAnos);

        if (valorRevenda < 0) {
            valorRevenda = 0;
        }

        return valorRevenda;
    }

}
