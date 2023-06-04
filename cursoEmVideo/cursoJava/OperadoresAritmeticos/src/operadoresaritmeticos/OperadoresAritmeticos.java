/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author josew
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2) / 2;
        System.out.println("A média é igual a " + m);
        
        int numero = 5;
        int valor = 5 + ++numero;
        System.out.println(valor);
        
        int x = 5;
        x += 4;
        System.out.println(x);
        
        float v = 8.3f;
        int floor = (int) Math.floor(v);
        System.out.println(floor);
        int ceil = (int) Math.ceil(v);
        System.out.println(ceil);
        int round = (int) Math.round(v);
        System.out.println(round);
        
        // Intervalo de 0 á 10
        int randomNum = (int) (0 + Math.random() * (11 - 0));
        
        System.out.println("Número aleátorio: " + randomNum);
    }
    
}
