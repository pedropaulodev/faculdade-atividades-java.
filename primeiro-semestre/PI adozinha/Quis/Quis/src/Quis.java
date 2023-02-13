import java.util.Scanner;
public class Quis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pergunta;
        boolean ajuda = true;


        System.out.println("Bem vindo ao Quiz\n");


        System.out.println("Vamos a pergunta: o que é o que é, cai em pé e corre deitado?\n");
        System.out.println("Escolha a resposta certa digitando o numero correspondente a opção!\n");
        System.out.println("1° opção: é o bulé");
        System.out.println("2° opção: é o macaco");
        System.out.println("3° opção: é a chuva");
        System.out.println("4° opção: é a fusca");


        while (ajuda) {
            pergunta = scan.nextInt();

            switch (pergunta) {
                case 1:
                    System.out.println("Errou a piada bocó");
                    break;
                case 2:
                    System.out.println("e macaco corre deitado por acaso ?");
                    break;
                case 3:
                    System.out.println("acertou mizeravi");
                    ajuda = false;
                    break;
                case 4:
                    System.out.println("o fusca que te da um tapa na nuca");
                    break;
                default:
                    System.out.println("esta não é uma opção valida, não sabe ler não é ?");
                    break;


            }

        }
    }
}
