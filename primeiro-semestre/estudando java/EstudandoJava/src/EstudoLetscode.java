import java.util.Scanner;

public class EstudosLetscode{



    public static void main ;(String[] args) {

        //--1) Número Secreto

        //--2) Limite de tentativas

        //--3) Número Proibido

        //--4) Quase acerto!

        Scanner scan = new Scanner(System.in);



        final int numeroSecreto = 97;

        final int numeroProibido = 82;

        int numero = -1;

        int numeroDeChances = 3;

        int i = 0;



        System.out.println("Adivinha o número secreto: ");



        boolean finaliza = false;

        //--Enquanto nao finaliza -> entao continua o jogo

        while( !finaliza ){

            i++; //--Faz a contagem



            if( i > numeroDeChances ){

                System.out.println("Tentou de mais!");

                finaliza = true; //--Forcador de saida!!

            } else {

                //--Faz a jogada do usuario

                numero = scan.nextInt();

                //--Processamento de acordo com a jogada

                switch( numero ){



                    case numeroSecreto:

                        System.out.println("Parabéns, você acertou em " + i + " tentativas!");

                        finaliza = true; //--Forcador de saida!!

                        break;



                    case numeroProibido:

                        System.out.println("Você digitou o número proibido!!!!! Perdeu!");

                        finaliza = true; //--Forcador de saida!!

                        break;



                    case(numeroSecreto + 1):

                    case(numeroSecreto - 1):

                        System.out.println("Você quase acertou e ganhou uma chance extra. Tente novamente: ");

                        numeroDeChances++;

                        break;



                    default:

                        if(i<numeroDeChances){

                            System.out.println("Tente novamente: ");

                        }

                        break;

                }

            }

        }

    }

}}}