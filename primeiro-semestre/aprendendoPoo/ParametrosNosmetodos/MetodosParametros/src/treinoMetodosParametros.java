import java.util.Scanner;
public class treinoMetodosParametros {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

//variavel de suporte que receberá o nome
    String nomeAluno;
    int idadeAuxiliar = 0;

//Criando o objeto atravez da classe que possui o metodo que utilizaremos
    mandaMensagem objetoMensagem = new mandaMensagem();

   //aqui pedimos o nome e guardamos na variavel auxiliar
        System.out.println("digite o seu nome");
        nomeAluno = scan.next();
        System.out.println("digita a sua idade");
        idadeAuxiliar = scan.nextInt();
//aqui invocamos o metodo mandaBoasVindas atravez do objeto criado
//e dentro de () colocamos a variavel auxiliar que passara as informações para a variavel que foi criada no metodo.
        objetoMensagem.mandaBoasVindas(nomeAluno,idadeAuxiliar);
            scan.close();
        objetoMensagem.enviaMensagem();

    }
}
