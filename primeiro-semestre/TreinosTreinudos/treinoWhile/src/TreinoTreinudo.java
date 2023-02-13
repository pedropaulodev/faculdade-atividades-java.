import java.util.Scanner;
public class TreinoTreinudo {
   public static void main   (String[] args){
    Scanner scan = new Scanner(System.in);

        int resposta;
        boolean finalize = true;
        int chances = 3;

       System.out.println("bem vindo ao programa de perguntas e respostas, escolha uma das opções de respostas apos a pergunta com a numeração correspondente!\n");

       System.out.println("1° pergunta: qual o animal que come com o rabo?\n");
        while (finalize && chances>0){
        chances = chances - 1;
       System.out.println("Opção numero 1: o crocodilo");
       System.out.println("Opção numero 1: a capivara");
       System.out.println("Opção numero 1: o leão");
       System.out.println("Opção numero 1: todos pois nenhum deles tira o rabo para comer");
       resposta = scan.nextInt();
       switch (resposta) {

           case 1:
               System.out.println("ERRouu! tente novamente ");
               break;

           case 2:
               System.out.println("ERRouu! tente novamente");
               break;

           case 3:
               System.out.println("ERRouu! tente novamente");
               break;


           case 4:

               System.out.println("Acertou mizeravi");
               finalize = false;
               break;

       }

       }


    }
}
