public abstract class ResultadoEscolar2 {
  public static void main(String[] args) {
    int nota = 6;
    // Condicionais encadeadas
    if (nota >= 7)
      System.out.println("Aprovado");
    else if (nota >= 5 && nota < 7)
      System.out.println("Recuperação");
    else
      System.out.println("Reprovado");
  }
}
