import java.util.Arrays;

public class Solucion {

    public static int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int[] copia = new int[n];
        int[][] posiciones = new int[n][2];

        for (int i = 0; i < n; i++) {
            copia[i] = nums[i];
            posiciones[i][0] = nums[i]; // valor
            posiciones[i][1] = i;       // índice
        }

        Arrays.sort(copia);
        int[] mayores = new int[k];
        for (int i = 0; i < k; i++) {
            mayores[i] = copia[n - 1 - i]; // k más grandes
        }

        // Guardar los k valores con su índice original, sin repetir
        boolean[] usados = new boolean[n];
        int[][] seleccionados = new int[k][2];
        int llenados = 0;
        for (int m : mayores) {
            for (int i = 0; i < n; i++) {
                if (!usados[i] && nums[i] == m) {
                    seleccionados[llenados][0] = nums[i];
                    seleccionados[llenados][1] = i;
                    usados[i] = true;
                    llenados++;
                    break;
                }
            }
        }

        // Ordenar por índice original
        Arrays.sort(seleccionados, (a, b) -> Integer.compare(a[1], b[1]));

        // Construir resultado
        int[] resultado = new int[k];
        for (int i = 0; i < k; i++) {
            resultado[i] = seleccionados[i][0];
        }

        return resultado;
    }
}
