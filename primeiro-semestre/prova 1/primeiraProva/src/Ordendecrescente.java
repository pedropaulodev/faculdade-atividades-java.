import java.util.Scanner;
public class Ordendecrescente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       int numero;


        System.out.print("Por favor digite um numero");
        numero = scan.nextInt();

        while (numero> -1){

            if (numero %2 ==0){

                if (numero == 0 ){
                    System.out.println(numero);
                }
                else {
                    System.out.println(numero + " * 10 = " + (numero * 10));
                }
            }

            else {
                System.out.println((numero-1)+" "+numero+" "+(numero+1));
            }

            numero = numero -1;















        }




    }
}
