import java.util.Scanner;
public class TrocoCompra {
    public static void main(String[] args){

        float produto;
        float dinheiro;


    System.out.println("Por favor digite o valor do produto");
    Scanner scan = new Scanner(System.in);
    produto = scan.nextFloat();

    System.out.println("Por favor Digite o valor recebido como pagamento em dinheiro");
    dinheiro = scan.nextFloat();

    if (dinheiro > produto){
        System.out.println("Seu troco é "+(dinheiro-produto)+" Obrigado pela preferência, volte sempre!");
    }
    else if (produto == dinheiro){
        System.out.println("Obrigado pela preferencia volte sempre!");
    }
    else {
        System.out.println("Valor insuficiente para pagar a compra");
    }

    }
}
