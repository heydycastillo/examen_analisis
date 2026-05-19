public class problema2 {

    public static int[] mayores(int[] array, int i, int f) {

        if (i == f) {

            int[] auxiliar = new int[2];

            auxiliar[0] = array[i];
            auxiliar[1] = -1;

            return auxiliar;
        }

        int medio = (i + f) / 2;

        int[] izq = mayores(array, i, medio);
        int[] drc = mayores(array, medio + 1, f);

        int[] resultado = new int[2];

        return resultado;
    }

    public static void main(String[] args) {

        int[] array = {8, 3, 10, 5, 7};

    }
}