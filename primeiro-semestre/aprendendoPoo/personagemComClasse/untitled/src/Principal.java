import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    personagem mamaco = new personagem();

        System.out.println("Bem vindo ao Rpg do mamaco, por favor diga o seu nome");
        mamaco.nome = scan.next();

        System.out.println(mamaco.nome +" você tem "+mamaco.totalVida+" de vida\n");

        System.out.println(mamaco.nome+"você pode pular");
        mamaco.Pular();

        System.out.println(mamaco.nome+"você tambem pode andar");
        mamaco.Andar();

        System.out.println("vamos a sua primeira luta, você ve um orangutango na sua frente e ele joga uma banana na sua cabeça causando dano\n");
        mamaco.Atacar();
        mamaco.sofrerDano(mamaco.totalVida);
        System.out.println("seu total de vida agora é "+mamaco.totalVida);

        System.out.println("Porem não fique triste, você conseguiu pegar a banana que o orangutangu jogou e isso recoperou seu hp");
        mamaco.curar(mamaco.totalVida);
        System.out.println("agora seu total de vida é "+mamaco.totalVida);
    }
}
