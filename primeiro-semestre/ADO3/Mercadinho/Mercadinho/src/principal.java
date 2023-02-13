import java.util.Scanner;
public class principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int swit = 0;
        
        Mercado obj = new Mercado();

        obj.escolhaCorredor();
        
        switch (obj.opcaocorredor){
            
            case "A":
            obj.corredorA(swit);
                System.out.println(obj.valorcorredorA);
            break;
            
        }
        
        
        
        
    }
}
