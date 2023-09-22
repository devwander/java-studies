public class App {
    // Tratamento de exceções
    // E quando inevitavelmente, ocorrer uma exceção? Como nós desenvolvedores podemos ajustar o nosso algoritmo para amenizar o ocorrido?
    // A instrução try, permite que você defina um bloco de código, para ser testado quanto a erros enquanto está sendo executado.
    // A instrução catch, permite definir um bloco de código a ser executado, caso ocorra um erro no bloco try.
    // A instrução finally, permite definir um bloco de código a ser executado, independente de ocorrer um erro ou não. As palavras-chave try e catch vem em pares.
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
