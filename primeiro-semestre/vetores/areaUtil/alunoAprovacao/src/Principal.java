import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        RecebeAluno[] aluno = new RecebeAluno[10];


        System.out.println("bem vindo ao programa que mostra e se você passou de ano!");

        int rep = 0;
        for (rep = 0; rep < aluno.length; rep++) {

            aluno[rep] = new RecebeAluno();

            System.out.println("por favor digite o nome do aluno de numero " + rep);
            aluno[rep].nomeAluno = scan.next();

            System.out.println("por favor insira a primeira nota do aluno");
            aluno[rep].nota1 = scan.nextDouble();

            System.out.println("por favor insira a segunda nota do aluno");
            aluno[rep].nota2 = scan.nextDouble();

            aluno[rep].aprovacao = ((aluno[rep].nota1 + aluno[rep].nota2) / 2);


        }

        for (rep = 0; rep < aluno.length; rep++) {

            if (aluno[rep].aprovacao >= 6) {
                System.out.println("a media do aluno " + aluno[rep].nomeAluno + " foi " + aluno[rep].aprovacao);
                System.out.println("por tanto o aluno foi aprovado");
            } else {
                System.out.println("a media do aluno " + aluno[rep].nomeAluno + " foi " + aluno[rep].aprovacao);
                System.out.println("por tanto o aluno foi reprovado");
            }


        }
    }
}