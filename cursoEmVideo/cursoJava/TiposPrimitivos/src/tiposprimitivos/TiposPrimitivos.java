/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author josew
 */

/*
 Família     | Tipo Primitivo | Classe Invólucro | Tamanho | Exemplo
-----------------------------------------------------------------
 Lógicos     | boolean       | Boolean          | -           | boolean isAtivo = true;
 Literais    | char          | Character        | 2 bytes     | char genero = 'M';
 Literais    | -             | String           | 1 byte/cada | String nome = "João";
 Inteiros    | byte          | Byte             | 1 byte      | byte idade = 30;
 Inteiros    | short         | Short            | 2 bytes     | short distancia = 1000;
 Inteiros    | int           | Integer          | 4 bytes     | int populacao = 1000000;
 Inteiros    | long          | Long             | 8 bytes     | long distanciaTotal = 123456789L;
 Reais       | float         | Float            | 4 bytes     | float altura = 1.75f;
 Reais       | double        | Double           | 8 bytes     | double peso = 75.5;

*/
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        /*
            int idade = teclado.nextInt()
            float salario = teclado.nextFloat()
            String nome = teclado.nextLine()
        */
        
        System.out.print("Digite o nome do aluno: ");
        
        String nome = teclado.nextLine();
        
        System.out.print("Digite a nota do aluno: ");
        
        float nota = teclado.nextFloat();
        
        System.out.println("Sua nota é " + nota);
        System.out.printf("A nota de %s é %.2f\n", nome, nota);
        System.out.format("A nota de %s é %.2f\n", nome, nota);
    }
    
}
