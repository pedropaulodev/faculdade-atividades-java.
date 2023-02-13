public class Conta {

    public double saldoConta = 500;

    public void saque(double valor){

        saldoConta = saldoConta - valor;

    }


    public void verificasaldo(double valorsaque){

        if (saldoConta > valorsaque ){

            saque(valorsaque);

            System.out.println("o seu saldo atual agora é "+saldoConta+"R$\n");

        }else {
            System.out.println("você não possui o valor solicitado disponivel para saque");
        }


    }

}
