/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author josew
 */


public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Wanderson";
        String nome2 = "Wanderson";
        String nome3 = new String("Wanderson");
        
        String res1 = (nome1 == nome2) ? "iguais" : "diferentes";
        System.out.println("nome1 e nome2 são: " + res1);
        
        String res2 = (nome2 == nome3) ? "iguais" : "diferentes";
        System.out.println("nome2 e nome3 são: " + res2);
        
        String res3 = (nome2.equals(nome3)) ? "iguais" : "diferentes";
        System.out.println("nome2 e nome3 são: " + res3);
    }
    
}
