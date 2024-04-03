public class ArrayEscritaUnica {
    public static void main(String[] args) {
        boolean[] podeModificar = new boolean[5];
        for (int i = 0; i < podeModificar.length; i++) {
            podeModificar[i] = true;
        }

        int[] array = {10, 20, 30, 40, 50};

        for (int i = 0; i < array.length; i++) {
            if (podeModificar[i]) {
                array[i] = array[i] * 2; // Modificação permitida
                podeModificar[i] = false; // Modificação não permitida na próxima vez
            }
        }

        // Imprimir o array modificado
        for (int num : array) {
            System.out.println(num);
        }
    }
}
