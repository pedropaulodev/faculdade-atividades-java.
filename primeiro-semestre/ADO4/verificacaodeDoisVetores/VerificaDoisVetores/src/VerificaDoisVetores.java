import java.util.Random;
import java.util.Scanner;
public class VerificaDoisVetores {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int recebeNumeros1[] = new int[20];
        int recebeNumeros2[] = new int[20];
        int comparavetores[] = new int[20];

        int usuarioNumero;
        boolean verificanumero = false;

        int j;
        int i;
        System.out.print("vetor 1: ");
        for (i = 0;i < recebeNumeros1.length;i++ ){

            int numero = rand.nextInt(50);

            recebeNumeros1[i] = numero;
            System.out.print(recebeNumeros1[i]+" ");
        }

        System.out.print("\n");
        System.out.print("vetor 2: ");
        for (i = 0;i < recebeNumeros1.length;i++ ){

            int numero = rand.nextInt(50);

            recebeNumeros2[i] = numero;
            System.out.print(recebeNumeros2[i]+" ");
        }

        System.out.print("\n");

        System.out.print("foram encontrados os seguintes numeros repetidos: ");
        for (i = 0;i < recebeNumeros1.length;i++ ) {
            for (j = 0;j< recebeNumeros2.length;j++){

            if (recebeNumeros1[i] == recebeNumeros2[j]) {
                comparavetores[i] = recebeNumeros1[i];

                System.out.print(comparavetores[i]+" ");
                verificanumero = true;
                //  break;
            }
            }

        }
        if (verificanumero == false) {
            System.out.println("Nenhum número repetido");
        }
    }
}


