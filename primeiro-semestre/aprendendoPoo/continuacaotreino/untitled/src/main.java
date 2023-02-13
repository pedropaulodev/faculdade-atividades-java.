import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double auxiliarl;
        double auxiliarc;

        AprendendoOverloading calc = new AprendendoOverloading();

        System.out.println("Por favor insira a largura do comodo");
        auxiliarl = scan.nextDouble();

        System.out.println("Por favor insira o comprimento do comodo");
        auxiliarc = scan.nextDouble();

        calc.calculando(auxiliarl, auxiliarc);

        System.out.println(calc.resultado);



    }


}
