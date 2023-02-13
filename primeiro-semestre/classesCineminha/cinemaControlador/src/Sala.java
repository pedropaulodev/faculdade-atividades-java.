public class Sala {

   public int totallugares;
   public String tipoCadeira;
   public String horarios;
   public String TipoTela;
   public String TipoSom;
   public boolean salaAberta;
   public String filme;


   public void abrirSala(){
       salaAberta = true;
   }

   public void fecharSala(){
       salaAberta = false;
   }

   public boolean estaAberta (){



      return salaAberta;
   }

}
