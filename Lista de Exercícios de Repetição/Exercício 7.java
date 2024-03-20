public class Main {
  public static void main(String[] args) {
      System.out.println("Números ímpares de 1 a 50:");
      
      // Loop de 1 a 50
      for (int i = 1; i <= 50; i++) {
          // Verifica se o número é ímpar
          if (i % 2 != 0) {
              System.out.println(i); // Imprime o número ímpar
          }
      }
  }
}