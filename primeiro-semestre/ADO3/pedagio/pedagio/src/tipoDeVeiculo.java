import java.util.Scanner;


public class tipoDeVeiculo {

    public int carroPequeno = 5;
    public int carroMedio = 10;
    public int carroGrande = 15;
    public int VanCaminhaoOnibus = 20;
    public int MotoBicileta = 0;
    public int tamanhoVeiculo;
    public int valorArrecadado;
    public int totalVeiculos=0;
    public boolean Loop = true;


    public void inicio (){
        while (Loop) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Por favor insira o tamanho do carro\n");
            System.out.println("digite 1 para registar um carro pequeno");
            System.out.println("digite 2 para registar um carro medio");
            System.out.println("digite 3 para registar um carro grande");
            System.out.println("digite 4 para registar Van caminhão ou onibus");
            System.out.println("digite 5 para registar moto e bicicleta");
            System.out.println("digite 6 para fechar o dia");
            tamanhoVeiculo = scan.nextInt();
            cobranca (tamanhoVeiculo);
            switch (tamanhoVeiculo){
                case 6:
                    System.out.println("voce arrecadou "+valorArrecadado+" reais");
                    System.out.println("você registrou o total de " +totalVeiculos+" de veiculos");
                    Loop = false;
                    break;
            }

        }

    }

    public void  cobranca (int tamanhoVeiculo){



       switch (tamanhoVeiculo) {

           case 1:
               valorArrecadado = valorArrecadado + carroPequeno;
               totalVeiculos++;
               System.out.println("Veiculo cadastrado com sucesso");
               break;


           case 2:
               valorArrecadado = valorArrecadado + carroMedio;
               totalVeiculos++;
               System.out.println("Veiculo cadastrado com sucesso");
               break;

           case 3:
               valorArrecadado = valorArrecadado + carroGrande;
               totalVeiculos++;
               System.out.println("Veiculo cadastrado com sucesso");
               break;

           case 4:
               valorArrecadado = valorArrecadado + VanCaminhaoOnibus;
               totalVeiculos++;
               System.out.println("Veiculo cadastrado com sucesso");
               break;

           case 5:
               valorArrecadado = valorArrecadado + MotoBicileta;
               totalVeiculos++;
               System.out.println("Veiculo cadastrado com sucesso");
               break;




       }


       }


    }


