/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author josew
 */

/*
+------------------------+---------------------+
| Operador Relacional    | Símbolo             |
+------------------------+---------------------+
| Igual a                | ==                  |
| Diferente de           | !=                  |
| Maior que              | >                   |
| Menor que              | <                   |
| Maior ou igual a       | >=                  |
| Menor ou igual a       | <=                  |
+------------------------+---------------------+
*/

public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 14;
        int n2 = 18;
        
        int r = (n1 > n2) ? n1 : n2;
        
        System.out.println(r);
    }
    
}
