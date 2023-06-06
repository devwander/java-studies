/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao;

/**
 *
 * @author josew
 */
public class TesteFuncao {

    /**
     * @param args the command line arguments
     */
    
    static void soma1(int a, int b) {
        int s = a + b;
        System.out.println(s);
    }
    
    static int soma2(int a, int b) {
        int s = a + b;
        return s;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Começou o programa!");
        
        System.out.println("- Função soma1");
        soma1(2, 3);
        
        System.out.println("- Função soma2");
        int sm = soma2(5, 2);
        System.out.println(sm);
    }
    
}
