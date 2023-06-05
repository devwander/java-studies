/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador01;

/**
 *
 * @author josew
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc1 = 1;
        
        while(cc1 <= 20) {
            System.out.println("Cambalhota! - " + (cc1));
            cc1++;
        }
        
        System.out.println("-------------------------------------------------------");
        
        int cc2 = 0;
        
        while (cc2<10) {
            cc2++;
            if (cc2 == 5 || cc2 == 7) {
                continue;
            }
            System.out.println("Cambalhota! - " + cc2);
        }
        
        System.out.println("-------------------------------------------------------");
        
        int cc3 = 0;
        
        while (cc3<10) {
            cc3++;
            if (cc3 == 2 || cc3 == 3 || cc3 == 4) {
                continue;
            }
            
            if (cc3 == 7) {
                break;
            }
            System.out.println("Cambalhota! - " + cc3);
        }
    }
    
}
