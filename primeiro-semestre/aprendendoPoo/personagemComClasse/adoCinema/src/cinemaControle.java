
import java.util.Scanner;
public class cinemaControle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nomeOperador ;
        int idOperador;
        boolean saidaLoop = true;
        int escolhaFilme;
         int primeiraSala = 31;
         int segundaSala = 35;
         int terceiraSala = 55;

        System.out.println("Bem vindo ao programa de controle de venda de ingressos.\n");
        System.out.println(" por favor digite o seu nome ");
        nomeOperador = scan.next();
        System.out.println(" por favor digite o seu iD para que possamos inicializar o programa");
        idOperador = scan.nextInt();

        cinemaVenda objVenda = new cinemaVenda();


        while (saidaLoop) {
            System.out.println("Por favor escolha o filme que deseja vender o ingresso \n");
            System.out.println("1° - O menino e o mundo - digite 1");
            System.out.println("2° - Tudo a todo tempo a toda hora - digite 2");
            System.out.println("3° - Summer - digite 3\n");

            System.out.println("se deseja fechar o caixa por favor digite 4");
            escolhaFilme = scan.nextInt();

            switch (escolhaFilme){

                case 1:
                    objVenda.vendendo(primeiraSala);
                break;

                case 2:
                    objVenda.vendendo(segundaSala);
                break;


                case 3:
                    objVenda.vendendo(terceiraSala);
                break;

                case 4:
                    System.out.println(" o total de ingressos vendidos foram: " + objVenda.totalIngressosVendidos);
                    System.out.println(" o total de dinheiro no caixa é: " + objVenda.totalIngressosVendidos * 42);
                    System.out.println("Tenha um bom descanço "+nomeOperador);
                    saidaLoop = false;
                break;


            }




        }


    }
}
