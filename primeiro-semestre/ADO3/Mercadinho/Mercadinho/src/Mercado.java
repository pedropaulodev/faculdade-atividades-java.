import java.util.Scanner;
public class Mercado {

public  String opcaocorredor;
public int quantidade = 0;
public double valorcorredorA;


    public void escolhaCorredor(){

        Scanner scan = new Scanner (System.in);
        System.out.println("Você deseja entrar em qual corredor?\n");
        System.out.println("Corredor A = corredor de frutas");
        System.out.println("Corredor B = corredor de itens basicos");
        System.out.println("Corredor c = corredor de carnes e frios");
        opcaocorredor = scan.next();

    }

    public void corredorA (int swit){
        Scanner scan = new Scanner (System.in);
        System.out.println("Estes são os itens disponiveis neste corredor, escolha de acordo com o numero!\n");
        System.out.println("1 - melão");
        System.out.println("2 - pêra");
        System.out.println("3 - maçã");
        System.out.println("4 - uva");
        System.out.println("5 - Abacate");
        System.out.println("6 - limão");
        System.out.println("7 - couve");
        swit = scan.nextInt();

        if (swit<=7){
                System.out.println("por favor digite a quantidade do item escolhido");
                quantidade = scan.nextInt();
                valorcorredorA = valorcorredorA  + quantidade * 2.5;

        }

       else {
            System.out.println("você digitou uma opção invalida");
        }


















    }


}

