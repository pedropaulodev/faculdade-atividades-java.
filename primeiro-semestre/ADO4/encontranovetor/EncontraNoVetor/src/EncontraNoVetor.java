import java.util.Scanner;
import java.util.Random;
public class EncontraNoVetor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int recebeNumeros[] = new int[6];
        int usuarioNumero;
        boolean verificanumero = false;

        int i;
        for (i = 0;i < recebeNumeros.length;i++ ){

            int numero = rand.nextInt(7);

            recebeNumeros[i] = numero;
        }

        System.out.println("por favor digite um numero para verificar se o mesmo existe nos vetores");
        usuarioNumero = scan.nextInt();


        for (i = 0;i < recebeNumeros.length;i++ ) {

            if (recebeNumeros[i] == usuarioNumero){
                System.out.println("Número encontrado na posição "+i);
                verificanumero = true;
                break;
            }

        }
        if (verificanumero == false) {
            System.out.println("Este número não existe no vetor");
        }
    }
}


