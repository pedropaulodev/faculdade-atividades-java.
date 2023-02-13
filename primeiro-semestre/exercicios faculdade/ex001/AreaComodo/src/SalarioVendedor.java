import java.util.Scanner;
public class SalarioVendedor {
    public static void main(String[] args){

        String nome;
        float salario;
        float vendas;
        double comissao;

        System.out.println("Por favor se identifique digitando o seu nome ");
        Scanner scan = new Scanner(System.in);
        nome = scan.next();

        System.out.println("Por favor digite o seu salario fixo ");
        salario = scan.nextFloat();

        System.out.println("Por favor digite o valor total de vendas realizadas no mês ");
        vendas = scan.nextFloat();

        comissao =  (vendas * 0.05);

        System.out.println(nome+ " O seu salario  será "+(salario+comissao));




    }

}
