import java.util.Scanner;
public class cinemaVenda {
Scanner scan = new Scanner(System.in);


    public int totalIngressosVendidos = 0;




    public void vendendo(int sala ){


        System.out.println(" por favor digite a quantidade de ingressos desejada");
        int qtdIngresso = scan.nextInt();

        if (qtdIngresso > sala) {
            System.out.println("infelizmenta não ha esta quantidade de lugares disponiveis");
        } else {
            System.out.println("foram vendidos " + qtdIngresso);
            sala = sala - qtdIngresso;
            totalIngressosVendidos = totalIngressosVendidos + qtdIngresso;
        }




    }

}












