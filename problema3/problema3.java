public class problema3 {

    public static int inversiones(int[] array) {
        int[] temporal = new int[array.length];
        return mergesort(array, temporal, 0, array.length - 1);
    }
    public  static int mergesort(int[] array, int[] temporal, int izquierda, int derecha) {
        int contador = 0;

        if (izquierda < derecha) {
            int medio = (izquierda + derecha) / 2;

            contador += mergesort(array, temporal, izquierda, medio);
            contador += mergesort(array, temporal, medio + 1, derecha);
            contador += merge(array, temporal, izquierda, medio, derecha);
        }

        return contador;
    }
    public  static int merge(int[] array, int[] temporal, int izquierda, int medio, int derecha) {

        int i = izquierda;
        int j = medio + 1;
        int k = izquierda;

        int contador = 0;

        while (i <= medio && j <= derecha) {

            if (array[i] <= array[j]) {
                temporal[k++] = array[i++];
            } else {
                temporal[k++] = array[j++];
                contador += (medio - i + 1);
            }
        }

        while (i <= medio) {
            temporal[k++] = array[i++];
        }

        while (j <= derecha) {
            temporal[k++] = array[j++];
        }

        for (i = izquierda; i <= derecha; i++) {
            array[i] = temporal[i];
        }

        return contador;
    }

   public static void main(String[] args) {

        int[] array = {3, 1, 2};

        int cantidad = inversiones(array);

        System.out.println("cantidad de inversiones: " + cantidad);
    }
}