/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoreslogicos;

/**
 *
 * @author josew
 */

/*
+-------------------+---------------------+
| Operador Lógico   | Símbolo             |
+-------------------+---------------------+
| E lógico          | &&                  |
| Ou lógico         | ||                  |
| Negação lógica    | !                   |
| OU exclusivo      | ^                   |
+-------------------+---------------------+
*/
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 4;
        int y = 7;
        int z = 12;
        
        boolean r1 = (x<y && y<z) ? true : false;
        System.out.println("x<y && y<z -> "+r1);
        
        boolean r2 = (x<y || y==z) ? true : false;
        System.out.println("x<y || y==z -> "+r2);
        
        boolean r3 = (x<y ^ y==z) ? true : false;
        System.out.println("x<y ^ y==z -> "+r3);
        
        boolean r4 = (x<y ^ y<z) ? true : false;
        System.out.println("x<y ^ y<z -> "+r4);
    }
    
}
