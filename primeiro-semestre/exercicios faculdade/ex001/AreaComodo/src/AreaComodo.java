import java.util.Scanner;

public class AreaComodo {
    public static void main (String [] args){

        float largura;
        float comprimento;

        System.out.println("Por favor digite a largura do comodo! ");
        Scanner scan = new Scanner(System.in);
        largura = scan.nextFloat();

        System.out.println("Por favor Digite o comprimento do comodo! ");
        comprimento = scan.nextFloat();

        System.out.println("A area util desse cômodo é "+(comprimento * largura)+" m²");


    }

}
