/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author josew
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0;
        String res;
        Scanner tec = new Scanner(System.in);
        
        do {
            System.out.print("Digite um número: ");
            n = tec.nextInt();
            
            s += n;
            
            System.out.println("Quer continuar? [S/N]");
            res = tec.next();
        }  while (res.equals("S"));
        
        System.out.println("A soma de todos os valores é: " + s);
    }
    
}
