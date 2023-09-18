public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        byte idade = 123;
        short ano;
        ano = 2023;
        int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
        long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
        float pi = 3.14F;
        double salario = 1275.33;

        String nome = "Wanderson";

        // short numeroCurto = 1;
        // int numeroNormal = numeroCurto;
        // short numeroCurto2 = numeroNormal;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        // Constantes
        final double VALOR_DE_PI = 3.14;

        // gera erro:
        // VALOR_DE_PI = 3.15;
    }
}
