import java.util.Scanner;
public class CompraCarroL2 {
    public static void main(String[] args){

        int escolha;
        double parcelas;
        double carro;
        double entrada;
        System.out.println("este é um sistema de compra de carros, por favor digite 1 para comprar um fusca, ou 2 para adquirir a BMW ");
        Scanner scan = new Scanner(System.in);
        escolha = scan.nextInt();

        if (escolha == 1){
            carro = 100000;
            entrada = (carro * 0.4);
            parcelas = ((carro-entrada)/12);
            System.out.println("O seu fusca deverá ser pago em uma entrada de "+entrada+" e mais 12 suaves parcelas de "+parcelas+" sem juros ");
        }
          else if (escolha == 2){
            carro = 150000;
            entrada = (carro * 0.4);
            parcelas = ((carro-entrada)/12);
            System.out.println("A sua BMW deverá ser paga em uma entrada de "+entrada+" e mais 12 suaves parcelas de "+parcelas+" sem juros ");
        }

        else{
            System.out.println("Você não escolheu uma opção de carro valida!");
        }

    }
}
