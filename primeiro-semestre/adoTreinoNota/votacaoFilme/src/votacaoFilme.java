import java.util.Scanner;
public class votacaoFilme {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    String f1, f2, f3, f4;
    int s1 = 0;
    int s2 = 0;
    int s3 = 0;
    int s4 = 0;
    int escolhafilme = 0;
    boolean finaliza = true;

        System.out.println("Bem vindo ao sistema de votação em filmes\n");

        System.out.println("Por favor digite o nome do primeiro filme a ser votado");
        f1 = scan.next();
        System.out.println("Por favor digite o nome do segundo filme a ser votado");
        f2 = scan.next();
        System.out.println("Por favor digite o nome do terceiro filme a ser votado");
        f3 = scan.next();
        System.out.println("Por favor digite o nome do quarto filme a ser votado");
        f4 = scan.next();

        while (finaliza){

        System.out.println("Escolha uma das opções abaixo: \n");
        System.out.println("se deseja votar no filme: "+f1+" digite 1");
        System.out.println("se deseja votar no filme: "+f2+" digite 2");
        System.out.println("se deseja votar no filme: "+f3+" digite 3");
        System.out.println("se deseja votar no filme: "+f4+" digite 4\n");
        System.out.println("digite 5 para finalizar o programa e verificar o resultado da votação\n");
        escolhafilme = scan.nextInt();

        switch (escolhafilme) {

            case 1:
                System.out.println("você votou no filme " + f1);
                s1 = s1 + 1;
                break;

            case 2:
                System.out.println("você votou no filme " + f2);
                s2 = s2 + 1;
                break;

            case 3:
                System.out.println("você votou no filme " + f3);
                s3 = s3 + 1;
                break;

            case 4:
                System.out.println("você votou no filme " + f4);
                s4 = s4 + 1;
                break;

            case 5:
                System.out.println(f1 + " recebeu " + s1 + " Votos");
                System.out.println(f2 + " recebeu " + s2 + " Votos");
                System.out.println(f3 + " recebeu " + s3 + " Votos");
                System.out.println(f4 + " recebeu " + s4 + " Votos\n");

                if (s1 > s2 && s1 > s3 && s1 > s4)
                {
                    System.out.println(f1+" é o filme com mais votos!");
                }

                else if(s2 > s1 && s2 > s3 && s2 > s4)
                {
                    System.out.println(f2+" é o filme com mais votos!");
                }

                else if (s3 > s1 && s3 > s2 && s3 > s4 )
                {
                    System.out.println(f3+" é o filme com mais votos!");
                }

                else if (s4 > s1 && s4 > s2 && s4 > s3 )
                {
                    System.out.println(f4+" é o filme com mais votos!");
                }


                finaliza = false;
                break;

            default:
                System.out.println("Você digitou uma opção invlida");
                break;

        }

            }// do switch



        }


    }



