    import java.util.Scanner;
public class SimuladorDeCarro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int switligacarro;
        int switopcaoandacarro;
        int switopcaomarcha = 0;

        int marcha = 0;
        int saidare;
        boolean re = true;

        boolean ligaDesligaCarro = true;
        boolean encerraPrograma = true;
        boolean andaparacarro = true;
        boolean a = true;


        while (encerraPrograma) {

            System.out.println("---------------------------------------------------------------------");
            System.out.println("estado atual do carro: desligado");
            System.out.println("---------------------------------------------------------------------");
            System.out.println("1) ligar carro");
            System.out.println("2) encerrar programa");
            switligacarro = scan.nextInt();


            switch (switligacarro) {

                case 1:
                     a = true;
                    // ligaDesligaCarro = true;
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("bem vindo ao simulador da auto escola se acalme q eu estou aprendendo");
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println(" o carro esta parado");
                    while (a) {
                        marcha = 0;
                        andaparacarro = true;
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("estado atual do carro: ligado");
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("1) desligar o carro");
                        System.out.println("2) andar");
                        System.out.println("3) engatar a ré");
                        System.out.println("---------------------------------------------------------------------");
                        switopcaoandacarro = scan.nextInt();

                        switch (switopcaoandacarro) {
                            case 1:
                                ligaDesligaCarro = false;
                                a = false;
                                break;
                            case 2:
                                while (andaparacarro) {
                                    if (marcha> 0){
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.println("O carro esta Andando");
                                    }else {
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.println("O carro esta Parado");

                                    }
                                    System.out.println("---------------------------------------------------------------------");
                                    System.out.println("O carro esta na marcha: "+marcha);
                                    System.out.println("---------------------------------------------------------------------");
                                    if (marcha <=7) {
                                        System.out.println("1) Parar o carro");
                                        System.out.println("2) Subir marcha");
                                        System.out.println("3) Descer marcha");
                                        System.out.println("---------------------------------------------------------------------");
                                    }
                                    else {
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.println("1) Parar o carro");
                                        System.out.println("3) Descer marcha");
                                        System.out.println("---------------------------------------------------------------------");
                                    }
                                    switopcaomarcha = scan.nextInt();
                                    switch (switopcaomarcha) {
                                        case 1:
                                            andaparacarro = false;
                                            break;

                                        case 2:
                                        marcha++;
                                        break;
                                        case 3:
                                        marcha--;
                                        break;
                                    }

                                }//segundo while
                                break;

                            case 3:
                                System.out.println("a marcha ré esta engatada");
                                System.out.println("1) para desengatar a ré");
                                saidare = scan.nextInt();
                                while (re)
                                switch (saidare){
                                    case 1:
                                       re = false;
                                    break;
                                }
                                break;

                        }

                    }
                    break;//break de ligar o carro

                case 2:
                    encerraPrograma = false;
                    System.out.println("o programa foi encerrado");
                    break;
            }


        }//primeiro while

    }
}
