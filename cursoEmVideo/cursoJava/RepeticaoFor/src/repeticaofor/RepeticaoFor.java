/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticaofor;

/**
 *
 * @author josew
 */
public class RepeticaoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int cc = 1; cc <= 4; cc++) {
            System.out.println("Cambalhota! - " + cc);
        }
        
        System.out.println("-------------------------------------------------------");

        for (int cc2 = 100; cc2 > 1; cc2-=10) {
            System.out.println(cc2);
        }
        
    }
    
    
    
}
