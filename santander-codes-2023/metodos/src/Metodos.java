public class Metodos {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public double somar(int num1, int num2) {
        // LOGICA - FINALIDADE DO MÉTODO
        double result = 1.5;
        return result;
    }

    public void imprimir(String texto) {
        // LOGICA - FINALIDADE DO MÉTODO
        // AQUI NÃO PRECISA DO RETURN
        // POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
    }

    // throws Exception : indica que o método ao ser utilizado
    // poderá gerar uma exceção
    public double dividir(int dividendo, int divisor) throws Exception {
        return divisor;
    }

    // este método não pode ser visto por outras classes no projeto
    private void metodoPrivado() {
    }

    // alguns equívocos estruturais
    public void validar() {
        // este método deveria retornar algum valor
        // no caso boolean (true ou false)
    }

    public void calcularEnviar() {
        // um método deve representar uma única responsabilidade
    }

    public void gravarCliente(String nome, String cpf, Integer telefone) {
    }

    public void gravarCliente(String cliente) {
    }

    public void gravar(String cliente) {
    }
}
