import java.util.Date;

public class Operadores {
    public static void main(String[] args) throws Exception {
        // Atribuição (=)
        String nome = "GLEYSON";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        // Aritméticos (*, /, +, -, %)
        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);
        // Em strings concatena
        String nomeCompleto = "LINGUAGEM" + "JAVA";

        // Unários (+, -, ++, --, !)
        int numero = 5;
        // Imprimindo o numero negativo
        System.out.println(-numero);
        // incrementando numero em mais 1 numero, imprime 6
        numero++;
        System.out.println(numero);
        // incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero++);// ops algo de errado não está certo
        System.out.println(numero);// agora sim, numero virou 7
        // ordem de precedencia conta aqui
        System.out.println(++numero);
        boolean verdadeiro = true;
        System.out.println("Inverteu " + !verdadeiro);

        // Ternário
        int a, b;
        a = 5;
        b = 6;

        /*
         * if(a==b)
         * resultado = "verdadeiro";
         * else
         * resultado = "falso";
         */

        String result = (a == b) ? "verdadeiro" : "false";
        System.out.println(result);

        // Relacionais
        // == Quando desejamos verificar se uma variável é IGUAL A outra.
        // != Quando desejamos verificar se uma variável é DIFERENTE da outra.
        // > Quando desejamos verificar se uma variável é MAIOR QUE a outra.
        // >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
        // < Quando desejamos verificar se uma variável é MENOR QUE outra.
        // <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.

        int numero1 = 1;
        int numero2 = 2;

        if (numero1 > numero2)
            System.out.print("Numero 1 maior que numero 2");

        if (numero1 < numero2)
            System.out.print("Numero 1 menor que numero 2");

        if (numero1 >= numero2)
            System.out.print("Numero 1 maior ou igual que numero 2");

        if (numero1 <= numero2)
            System.out.print("Numero 1 menor ou igual que numero 2");

        if (numero1 != numero2)
            System.out.print("Numero 1 é diferente de numero 2");

        // Comparações avançadas

        String nome1 = "JAVA";
        String nome2 = "JAVA";

        // equals (equivalente á == | usado para comparar objetos (ex: Strings))
        System.out.println(nome1.equals(nome2));

        // Lógicos
        // && Operador Lógico "E"
        // || Operador Lógico "OU"

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2)
            System.out.print("Os dois valores precisam ser verdadeiros");
        ;
        // Se condicao1 OU condicao2 for verdadeira, executar código.
        if (condicao1 || condicao2)
            System.out.print("Um dos valores precisa ser verdadeiro");
    }
}
