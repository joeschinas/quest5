
package questfive;

import entidades.PopulacaoBaratas;
import java.util.Locale;
import java.util.Scanner;


public class Program {

    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner read = new Scanner(System.in);
       
       
       
        System.out.println("Ha quantas baratas na  cozinha?");
        int quantidade = read.nextInt();
         PopulacaoBaratas baratas = new PopulacaoBaratas(quantidade); 
        for (int i=1; i<=3; i++){
           
        System.out.println("Aplicar Splay de Veneno...\n restou"+baratas.sprayVeneno());
        
        System.out.println("Alguem Tempo Depois..........duplicou");
        System.out.println("quantidade de baratas ficou ... vivas \n"+baratas.dubrarPopulacao());
            
        
   
        
        
        
        }
        System.out.println("Elas estão ficando mais fortes");
    }
    
    
}
