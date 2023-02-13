import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int rep = 0;

        larguraEcomprimento[] lc = new larguraEcomprimento[10];


        System.out.println("Bem vindo a calculadora de area de comodos");


        for (rep = 0; rep < lc.length;rep++){

         //o que essa parte faz mesmo ?
            lc[rep] = new larguraEcomprimento();

            System.out.println("digite o comprimento do comodo em metros quadrados");
            lc[rep].comprimento = scan.nextDouble();

            System.out.println("digite a largura do comodo em metros quadrados");
            lc[rep].largura = scan.nextDouble();


            lc[rep].area = lc[rep].largura*lc[rep].comprimento;



        }

        for (rep = 0; rep< lc.length;rep++){

            System.out.println("essa é a area util do "+lc[rep]+" comodo "+lc[rep].area);

        }

    }

}