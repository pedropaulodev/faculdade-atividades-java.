import java.util.Scanner;

public class numerospares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int recebeNumeros[] = new int[10];
        int indice = 1;

        System.out.println("bem vindo ao identificador de numeros pares");

        int i;
        for (i = 0; i< recebeNumeros.length;i++){

            System.out.println("por favor digite o "+indice+"° numero");
            recebeNumeros[i] = scan.nextInt();

        indice++;
        }

        for (i = 0; i< recebeNumeros.length;i++){
           if(recebeNumeros[i] % 2 == 0) {
               System.out.println("o numero é "+recebeNumeros[i]+" e seu indice no vetor é "+i);
           }


        }



    }
}
