import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        double recebeNumero[] = new double[8];
        double guardasoma = 0;
        double resultado;
        int indicador = 1;

        System.out.println("bem vindo a calculadora de media");

        int i;
        for ( i = 0;i< recebeNumero.length;i++){

            System.out.println("por favor digite o "+indicador+"° numero");

            recebeNumero[i] = scan.nextDouble();

            guardasoma = guardasoma + recebeNumero[i];

            indicador++;
        }

        resultado = guardasoma/8;

        System.out.println(" a media dos valores recebidos é " +resultado);


    }
}
