import java.util.Scanner;
public class AntecessorSucessorL2 {
    public static void main(String[] args){

     int menos1 = 1;
     int mais1 = 1;
     int cliente;
     System.out.println("Por favor digite um numero para que eu mostre o seu antecessor e sucessor ");
     Scanner scan = new Scanner(System.in);
     cliente = scan.nextInt();

     if(cliente > 0) {
         System.out.println((cliente - menos1) + "," + cliente + "," + (mais1 + cliente));
     }
     else {
         System.out.println("Você precisa digitar um numero maior que 0 para que o programa funcione! ");
     }

    }
}
