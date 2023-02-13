public class OrdemDosNumeros {
    public static void main(String[] args) {


        int recebeNumeros[] = {0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1};
        int auxiliar;


        int j;
        int i;
        //i = 0     semelhante a estrutura da matris, nos utilizamos um for dentro de um for para fazer comparação entre os proprios numeros do vetor
        //j = 0     o vetor j vai percorrer todos os numeros antes do vetor 1 mudar de posição, ou seja ele vai sempre pegar um numero e comparar com todos dentro do vetor e fazer isso com todos eles.
        for (i = 0; i < recebeNumeros.length; i++) {
            for (j = 0; j < recebeNumeros.length; j++){

       //verifica nas posiçães qual numero é menor
                if (recebeNumeros[i] < recebeNumeros[j]){
                  //guarda o numero menor na auxiliar
                    auxiliar = recebeNumeros[i];
                  // coloca n posição do numero menor o numero maior
                    recebeNumeros[i] = recebeNumeros[j];
                  //coloca na posição do numero maior o numero menor
                    recebeNumeros[j] = auxiliar;
                  //no caso deste codigo a logica é ao contrario.
                }

            }
        }

        for (i = 0; i < recebeNumeros.length; i++) {
            System.out.print(recebeNumeros[i]+" ");
        }

        }

    }
