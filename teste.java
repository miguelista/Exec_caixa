import java.util.Scanner;

public class teste extends Main {


    Scanner scan = new Scanner(System.in);

    @Override
    public void entrada() {
        System.out.println("entrada de caixa");
        System.out.println("insira o valor a ser vendido");
        venda = scan.nextDouble();
        saldo = saldo + venda;

    }

    @Override
    public void exibicao() {
        System.out.println("o valor de saldo atual é " + saldo);

        System.out.println("Gostaria de inserir outro valor? 'true' para sim / 'false' para não");

        sim_nao = scan.nextBoolean();
        if(sim_nao) {
            entrada();
            exibicao();
        }
    }
}