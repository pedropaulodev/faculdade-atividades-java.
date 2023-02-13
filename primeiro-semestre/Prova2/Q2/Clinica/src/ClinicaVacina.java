import java.util.Scanner;
public class ClinicaVacina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int raiva = 100;
        int gripe = 100;
        int vermes1 = 100;
        int vermes2 = 100;
        int totaldoses = 0;

        int switzin;
        boolean repetidor = true;
        int Inpt;
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Bem vindo ao controle de estoque de vacinas");
        while (repetidor) {

            System.out.println("--------------------------------------------------------------------------");
            System.out.println("Abaixo estão as vacinas disponiveis e a opção de encerrar o programa, digite o numero correspondente a opção desejada!");
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("1) Vacina para raiva");
            System.out.println("2) Vacina para gripe");
            System.out.println("3) Vacina para vermes tipo 1");
            System.out.println("4) Vacina para vermes tipo 2");
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("5) Fim do dia");
            System.out.println("--------------------------------------------------------------------------");
            switzin = sc.nextInt();

            switch (switzin) {
                case 1:
                    raiva--;
                    totaldoses++;
                    System.out.println("Retire seu comprovante de vacinação contra raiva  digitando o numero 1 no teclado, Obrigado!");
                    Inpt = sc.nextInt();

                    break;

                case 2:
                    gripe--;
                    totaldoses++;
                    System.out.println("Retire seu comprovante de vacinação contra digitando o numero 1 no teclado gripe, Obrigado!");
                    Inpt = sc.nextInt();
                    break;

                case 3:
                    vermes1--;
                    totaldoses++;
                    System.out.println("Retire seu comprovante de vacinação contra vermes tipo 1 digitando o numero 1 no teclado, Obrigado!");
                    Inpt = sc.nextInt();
                    break;

                case 4:
                    vermes2--;
                    totaldoses++;
                    System.out.println("Retire seu comprovante de vacinação contra vermes tipo 2 digitando o numero 1 no teclado, Obrigado!");
                    Inpt = sc.nextInt();
                    break;

                case 5:
                    repetidor = false;
                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("O total de doses de vacinas aplicadas no dia foi: "+totaldoses);
                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("o total de doses aplicadas por tipo de vacina foi");
                    System.out.println("Vacina contra raiva: "+(100-raiva)+" doses");
                    System.out.println("Vacina contra gripe: "+(100-gripe)+" doses");
                    System.out.println("Vacina contra vermes do tipo 1: "+(100-vermes1)+" doses");
                    System.out.println("Vacina contra vermes do tipo 2: "+(100-vermes2)+" doses");
                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("o total de doses que restam de cada vacina é :");
                    System.out.println("Vacina contra raiva: "+raiva+" doses");
                    System.out.println("Vacina contra gripe: "+gripe+" doses");
                    System.out.println("Vacina contra vermes do tipo 1: "+vermes1+" doses");
                    System.out.println("Vacina contra vermes do tipo 2: "+vermes2+" doses");
                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("As vacinas que precisarão ser repostas no estoque são");
                    if (raiva <= 10){
                        System.out.println("--------------------------------------------------------------------------");
                        System.out.println("será necessario repor o total de "+(100-raiva));
                    } else if (gripe <= 10) {
                        System.out.println("--------------------------------------------------------------------------");
                        System.out.println("será necessario repor o total de "+(100-gripe));
                    } else if (vermes1 <= 10) {
                        System.out.println("--------------------------------------------------------------------------");
                        System.out.println("será necessario repor o total de "+(100-vermes1));
                    } else if (vermes2 <= 10) {
                        System.out.println("--------------------------------------------------------------------------");
                        System.out.println("será necessario repor o total de "+(100-vermes2));
                    }else {
                        System.out.println("--------------------------------------------------------------------------");
                        System.out.println("não ha necessidade de repor vacinas por enquanto");
                    }


                    break;

            }

        }




    }

}

