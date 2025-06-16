package Modulo_05_Orientacao_a_objetos.Aula_05_27_Metodos_que_alteram_variavel_de_instancia;

public class Aeronave {

    boolean ativo = true;
    int totalAssentos;
    int assentosReservados;

    int calcularAssentosDisponiveis() {
        return totalAssentos - assentosReservados;
    }

    void reservarAssentos(int numeroAssentos) {

        if (ativo) {
            assentosReservados += numeroAssentos;
        } else {
            // existe uma forma melhor de fazer isso (exceções)
            // mas ainda não estudamos sobre isso
            System.out.println("Aeronave desativada. Assentos não reservados.");
        }
    }

    void desativar() {
        ativo = false;
    }

    void ativar() {
        ativo = true;
    }

}
