package exercicio1;

import java.util.Scanner;


public class Exercicio1 {

    
    public static void main(String[] args) {
        
        float deposito;
        double juros;
        double rendimento1;
        double rendtotal;
         Scanner leia = new Scanner(System.in);
         System.out.println("Digite o valor do deposito");
         deposito = Float.parseFloat(leia.nextLine());
        System.out.println("Digite o valor da taxa de juros");
         juros = Float.parseFloat(leia.nextLine());
        
        rendimento1=(juros*deposito);
        rendtotal = (rendimento1+deposito);
        
        System.out.println("Valor do deposito é R$ "+ deposito);
        System.out.println("Valor do rendimento é R$ "+ rendimento1);
        System.out.println("Valor total depois do rendimento é R$ "+  rendtotal);
     
        
          
        
    }
    
}
