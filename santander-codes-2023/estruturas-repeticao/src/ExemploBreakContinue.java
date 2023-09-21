public class ExemploBreakContinue {

  public static void main(String[] args) {
    v1();
    System.out.println("----");
    v2();
  }

  public static void v1() {
    for (int numero = 1; numero <= 5; numero++) {
      if (numero == 3)
        break;
      System.out.println(numero);
    }
  }

  public static void v2() {
    for (int numero = 1; numero <= 5; numero++) {
      if (numero == 3)
        continue;
      System.out.println(numero);
    }
  }
}