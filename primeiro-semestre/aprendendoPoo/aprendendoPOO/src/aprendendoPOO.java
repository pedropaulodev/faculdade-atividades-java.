import java.util.Scanner;

public class aprendendoPOO {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

//metodo que cria o objeto c1 apartir da classe caneta utilizando o new.
        caneta canetAzul = new caneta();

//preenchendo o objeto canetAzul com os atributos que a classe dele possui.
        canetAzul.cor = "azul";
        canetAzul.modelo = "Caneta Esferografica";
        canetAzul.ponta = 0.5f;
        canetAzul.tampada = true;

        canetAzul.dadosDacaneta();


    }

}
