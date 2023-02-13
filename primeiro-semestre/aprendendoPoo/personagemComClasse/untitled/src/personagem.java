public class personagem {

    public String nome;
    public int totalVida = 100;
    public float totalDano = 15;

    public void Andar(){

        System.out.println("andando");

    }

    public void Pular(){

        System.out.println("pulando");

    }


    public float Atacar(){

        System.out.println("atacando");
        System.out.println("Você recebeu "+totalDano+" de dano");
        return totalDano;

    }

    public void sofrerDano (float tomodano){

      totalVida=  totalVida - 15;

    }

    public void curar (float curinha ) {

        totalVida = totalVida + 10;


    }


}
