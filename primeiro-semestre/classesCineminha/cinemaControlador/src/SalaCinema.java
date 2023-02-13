import java.util.Scanner;
public class SalaCinema {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        Sala  primeirasala = new Sala();
      int statusSala;

        System.out.println("se você deseja fechar a sala digite 1, se vc deseja abrir a sal digite 1");
        statusSala = scan.nextInt();

        switch (statusSala){
            case 1:
                primeirasala.fecharSala();
            break;

            case 2:
                primeirasala.abrirSala();
            break;
        }


        if (primeirasala.estaAberta() == true){

            System.out.println(" a sala esta aberta ");

        }
        else{
            System.out.println("a sala esta fechada");
        }

    }
}
