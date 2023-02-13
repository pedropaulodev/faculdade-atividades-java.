import java.util.Scanner;
public class Vetorpares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       int numerospares = 0;


        int [] numeros = new int[20];


        for(int rep = 0 ; rep < numeros.length ; rep++){

            numeros[rep] = scan.nextInt();

            if (numeros[rep] % 2 == 0){
                numerospares++;
            }


        }

        System.out.println("o total de numeros pares digitados é "+numerospares);

    }
}
