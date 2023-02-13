import java.util.Scanner;
public class DiasVividos {
     public static void main(String[] args){

         int idade;
         int meses;
         int dias;
         int totalmeses;

     System.out.println("Por favor digite a sua idade ");
     Scanner scan = new Scanner(System.in);
     idade = scan.nextInt();

     System.out.println("Por favor o mes atual de forma numerica (Mês 1 = janeiro)");
     meses = scan.nextInt();

     System.out.println("Por favor digite o dia do mes atual ");
     dias = scan.nextInt();

     totalmeses =((idade*365) + (meses*30))  + dias;

     System.out.println("Você ja viveu "+totalmeses+" dias");



     }
}
