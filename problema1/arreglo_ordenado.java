public class arreglo_ordenado {
    
    public static boolean identificador(int[] array, int i,int n) {
        if (i == n ) {
            return true;
        }
        if (array[i] > array[i + 1]) {
            return false;
        }
        return identificador(array, i + 1,n);
    }
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 8};
        int n =4;
        int[] array2 = {1, 4,2,8};
        int x =3;
        System.out.println("arreglo 1:");
        System.out.println(identificador(array, 0,n));
        System.out.println("arreglo2:");
        System.out.println(identificador(array2, 0,x));
    }
}