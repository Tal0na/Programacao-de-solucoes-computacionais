public class NumerosPares {
  public static void main(String[] args) {
      System.out.println("Números pares de 1 a 50:");

      // Loop for para iterar de 1 a 50
      for (int i = 1; i <= 50; i++) {
          // Verificar se o número é par
          if (i % 2 == 0) {
              System.out.println(i);
          }
      }
  }
}
