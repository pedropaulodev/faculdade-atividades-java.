import java.util.Random;
import java.util.Scanner;
public class CaraCoroa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int recebeNumeros1[] = new int[5];
        int escolha;
        int pontos =0;

        int i;
        for (i = 0; i < recebeNumeros1.length; i++) {

            int numero = rand.nextInt(2);
            recebeNumeros1[i] = numero;
            System.out.print(recebeNumeros1[i] + " ");
        }

        for (i = 0; i <= 4; i++) {

            System.out.println("Teste sua sorte, escolha: cara = 0 ou coroa = 1");
            escolha = scan.nextInt();

            if (escolha == recebeNumeros1[i]){
            System.out.println("parabèns você acertou jogue mais uma vez\n");
            pontos++;
        }else {
                System.out.println("voce errou tente novamente\n");
            }

        }

        System.out.println("você acertou um total de: "+pontos+" vezes");


    }


}
