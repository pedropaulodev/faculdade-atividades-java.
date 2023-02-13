import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Conta objconta = new Conta();

       double auxilioverificacao;
       double auxiliarsaque;

        System.out.println("olá, você possui disponivel para saque o valor de "+objconta.saldoConta+"R$\n");

        System.out.println("por favor digite o valor de saque desejado");
        auxilioverificacao = scan.nextDouble();

        objconta.verificasaldo(auxilioverificacao);




    }
}
