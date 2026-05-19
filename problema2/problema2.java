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

        if (izq[0] > drc[0]) {
            resultado[0] = izq[0];

            if (izq[1] > drc[0]) {
                resultado[1] = izq[1];
            } else {
                resultado[1] = drc[0];
            }

        } else {
            resultado[0] = drc[0];

            if (izq[0] > drc[1]) {
                resultado[1] = izq[0];
            } else {
                resultado[1] = drc[1];
            }
        }

        return resultado;
    }


    public static void main(String[] args) {

        int[] array = {8, 3, 10, 5, 7};
        int n=4;

        int[] segundomayor = mayores(array, 0, n);
        System.out.println("segundo mayor: " + segundomayor[1]);

    }
}