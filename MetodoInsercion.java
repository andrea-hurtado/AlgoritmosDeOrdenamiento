public class MetodoInsercion {
    public void ordenar(int[] arreglo, boolean isDes, boolean muestraPasos) {
        int n = arreglo.length;
        for (int i = 1; i < n; i++) {
            int aux = arreglo[i]; // Guardamos los valores para la siguiente línea
            int j = i - 1;
            while (j >= 0 && ((isDes && arreglo[j] < aux) || (!isDes && arreglo[j] > aux))) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = aux;
            
            if (muestraPasos) {
                System.out.print("Iteración " + i + ": ");
                imprimirArreglo(arreglo);
            }
        }
    }

    public void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println(); //Salto de línea al finalizar
    }
}