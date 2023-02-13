import java.util.Scanner;
public class SaqueConta {

    public static void main(String[] args){

        float saldo;

        System.out.println("Por favor digite o saldo da conta");

        Scanner scan = new Scanner(System.in);
        saldo = scan.nextFloat();

        if (saldo >= 20){
        System.out.println("O seu saldo atual restante é "+(saldo-20)+"R$");

    }
    else{
        System.out.println("Saldo insuficiente");
        }

}}
