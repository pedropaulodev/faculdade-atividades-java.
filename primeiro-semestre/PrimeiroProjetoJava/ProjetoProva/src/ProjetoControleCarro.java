import java.util.Scanner;
public class ProjetoControleCarro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        int carro = 0;                                     // guarda a qtd de carros
        int pagamento = 0;                                  // guarda os pagamentos
        int escolha;                                    // guarda a o valor da operação entre primeira segunda e terceira opção
        int vezes = 0;
        boolean finaliza = false;                           //finalia o looping das opções, utilizo na ultima opção para fechar o progrma.

        System.out.println("Bem vindo ao sistema de controle do estacionamento, por favor escolha uma das opções desejadas:\n"); // apresentação do programa que aparece na primeira vez


        while (!finaliza){ // looping das opções
        //apresentação das opções
        System.out.println("Para adicionar um carro digite : 1 ");
        System.out.println("Para retirar um carro digite : 2 ");
        System.out.println("Para fechar o dia digite  : 3 ");
        escolha = scan.nextInt();// espaço para o usuario digitar operação desejada


            vezes++;


                switch (escolha) {                            //estrutura de escolha usando o dado que foi digitado na variavel escolha

                    case 1:                                   //primeira opção de escolha onde o programa adiciona um carro a "garagem"
                        if(carro >= 9) {                    //verifica se a garagem ja não esta com as 10 vagas preenchidas
                        System.out.println("As 10 vagas ja estão ocupadas e você não pode exceder esse limite!\n");
                        }
                        else {                               // se restar espaço, o carro é adicionado efetivamente.
                            carro++;                         //variavel onde o carro é adicionado e atualizado a cada vez que essa opção é escolhida pelo usuario
                            System.out.println("Você adicionou um carro com sucesso ");// mensagens de sucesso de adição
                            System.out.println("O total de carros no momento é :" + carro + "\n");
                        }
                        break;

                    case 2:                                    // segunda opção onde é retirado um carro assim que o pagamento é efetuado
                        int recebido = 0;                      //variavel onde o valor do pagamento vai ser colocado para ser verificado mais a frente
                        if (carro == 0) {                      // verificação para saber se ainda tem carros no patio
                            System.out.println("não ha mais carro para retirar!\n");
                        }
                        else{                                  // se ainda ha carros no patio a retirada de ser feita

                            while (recebido < 25) {             // o valor recebido precisa ser = o valor do aluguel da garagem
                                System.out.println("O valor a pagar é 25.00 R$, por favor digite o valor pago"); // pede o valor
                                recebido = scan.nextInt();      //recebe o valor
                            }
                            System.out.println("Você retirou um carro com sucesso! ");
                            System.out.println("O total de carros no momento é :" + carro + "");
                            carro--;                            // tira um carro
                            pagamento = pagamento + 25;         // guarda um recebimento a variavel pagamenta a cada vez que o pagamento é efetuado
                            System.out.println("ha o total de " + pagamento + " R$ no caixa!\n"); // mostra o total no caixa
                        }
                        break;

                    case 3:                                    // opção que exibe total e carros de carros no patio + o total de dinheiro no caixa e encerra o programa
                            System.out.println("O total de veiculos que ainda estão no patio é: "+carro);
                            System.out.println("O Valor total em caixa e: "+pagamento+" R$\n");
                            System.out.println("Registro de dia encerrado!");
                             finaliza = true;                   // finaliza o programa com a variavel boleana que foi colocano no primeiro looping.
                        break;

                    default:
                        System.out.println("Esta não é uma opção valida!\n "); // defout que mostra erro se as opções não forem escolhidas de forma correta

                }// do switch

            }// do while

       // }// do else






    }


}
