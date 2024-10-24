import java.util.Scanner;

public class caixa {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        teste t1 = new teste();
        t1.venda = 0;
        t1.saldo = 0;
        t1.sim_nao = false;

        t1.entrada();
        t1.exibicao();
    }
}