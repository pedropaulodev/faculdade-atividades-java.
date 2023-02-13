public class TrocaDeValores {

    public static void main(String[] args){

        float n1 = 10;
        float n2 = 15;
        float s1;

        s1 = n1;
        n1 = n2;
        n2 = s1;

        n2 = n1;
        n1 = n2;
        n1 = s1;

        System.out.println("O Valor do primeiro numero é "+n1+" e o valor do segundo numero é "+n2);
    }

}
