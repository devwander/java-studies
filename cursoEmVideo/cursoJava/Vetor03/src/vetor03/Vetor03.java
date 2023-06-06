/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor03;

import java.util.Arrays;

/**
 *
 * @author josew
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double v[] = {2.5, 8.6, -4.5, 9, 3.5};
        
        System.out.println("Array desordenado!");
        
        for (double valor: v) {
            System.out.println(valor);
        }
        
        System.out.println("Array ordenado!");
        
        Arrays.sort(v);
        
        for (double valor: v) {
            System.out.println(valor);
        }
       
    }
    
}
