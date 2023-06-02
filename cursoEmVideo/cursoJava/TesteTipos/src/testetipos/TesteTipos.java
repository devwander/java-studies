/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetipos;

/**
 *
 * @author josew
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int idade1 = 30;
        
        String valor1 = Integer.toString(idade1);
        
        System.out.println(valor1);
        
        // -------------------------------------
        
        String valor2 = "30";
                
        int idade2 = Integer.parseInt(valor2);
        
        System.out.println(idade2);
        
        // -------------------------------------
        
        String valor3 = "30.5";
        
        float idade3 = Float.parseFloat(valor3);
        
        System.out.println(idade3);
    }
    
}
