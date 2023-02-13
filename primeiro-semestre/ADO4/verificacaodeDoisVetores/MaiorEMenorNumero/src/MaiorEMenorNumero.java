import java.util.Random;
import java.util.Scanner;
public class MaiorEMenorNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int recebeNumeros1[] = new int[10];

        int numeromaior = 0;
        int numeromenor = 0;

        int i;
        for (i = 0; i < recebeNumeros1.length; i++) {

            int numero = rand.nextInt(50);
            recebeNumeros1[i] = numero;
            System.out.print(recebeNumeros1[i] + " ");

            numeromaior = recebeNumeros1[i];
            numeromenor = recebeNumeros1[i];
        }

        for (i = 0; i < recebeNumeros1.length; i++) {

            if (recebeNumeros1[i] > numeromaior){
                numeromaior = recebeNumeros1[i];
            }

        }
        System.out.println("\no nomero maior é o "+numeromaior);

        for (i = 0; i < recebeNumeros1.length; i++) {

            if (recebeNumeros1[i] < numeromenor){
               numeromenor = recebeNumeros1[i];
            }
        }
        System.out.println("o nomero menor é o "+numeromenor);
        }

    }
