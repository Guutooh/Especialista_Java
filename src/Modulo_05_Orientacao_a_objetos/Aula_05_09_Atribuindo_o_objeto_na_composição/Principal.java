package Modulo_05_Orientacao_a_objetos.Aula_05_09_Atribuindo_o_objeto_na_composição;


public class Principal {

    public static void main(String[] args) {
        Pessoa eu = new Pessoa();
        eu.nome = "Thiago Faria";
        eu.cpf = "111.222.333-44";
        eu.anoNascimento = 1981;

        Pessoa voce = new Pessoa();
        voce.nome = "João das Couves";
        voce.cpf = "999.999.999-99";
        voce.anoNascimento = 1992;

        Carro meuCarro = new Carro();

        meuCarro.anoFabricacao = 2021;
        meuCarro.cor = "Preto";
        meuCarro.fabricante = "Honda";
        meuCarro.modelo = "HR-V";
        meuCarro.proprietario = eu;

//        meuCarro.proprietario = new Modulo_05_Orientacao_a_objetos.Aula_05_08_Composicao_de_objetos.Modulo_05_Orientacao_a_objetos.Aula_05_09_Atribuindo_o_objeto_na_composição.Pessoa();
//        meuCarro.proprietario.nome = "Thiago Faria";
//        meuCarro.proprietario.cpf = "111.222.333-44";
//        meuCarro.proprietario.anoNascimento = 1981;

        Carro seuCarro = new Carro();
        seuCarro.anoFabricacao = 2022;
        seuCarro.cor = "Branco";
        seuCarro.fabricante = "BMW";
        seuCarro.modelo = "X6";
        seuCarro.proprietario = voce;

        System.out.println("Meu carro");
        System.out.println("---------");
        System.out.printf("Modelo: %s%n", meuCarro.modelo);
        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);
        System.out.printf("Proprietário: %s%n", meuCarro.proprietario.nome);

        System.out.println();

        System.out.println("Seu carro");
        System.out.println("---------");
        System.out.printf("Modelo: %s%n", seuCarro.modelo);
        System.out.printf("Ano: %d%n", seuCarro.anoFabricacao);
        System.out.printf("Proprietário: %s%n", seuCarro.proprietario.nome);
    }

}
