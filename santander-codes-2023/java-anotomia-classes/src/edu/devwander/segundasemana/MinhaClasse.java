package edu.devwander.segundasemana;

public class MinhaClasse {
  public static void main(String[] args) {
    System.out.println("Anatomia das Classes");

    String primeiroNome = "Wanderson";
    String segundoNome = "José";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.println(nomeCompleto);
  }

  public static String nomeCompleto(String primeiroNome, String segundoNome) {
    return "Resultado do método -> " + primeiroNome.concat(" " + segundoNome);
  }
}
