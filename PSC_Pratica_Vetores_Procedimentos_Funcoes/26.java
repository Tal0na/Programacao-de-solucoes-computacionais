public class MediaVetor {
  public static void main(String[] args) {
      int[] vetor = {10, 20, 30, 40, 50};
      calcularMedia(vetor);
  }

  public static void calcularMedia(int[] vetor) {
      int soma = 0;
      for (int num : vetor) {
          soma += num;
      }
      double media = (double) soma / vetor.length;
      System.out.println("A média é: " + media);
  }
}
