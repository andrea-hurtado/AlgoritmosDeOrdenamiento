public class MetodoBurbuja {
    //Ordenar
    public void ordenar(int[] arreglo, boolean isDes, boolean muestraPasos) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if ((isDes && arreglo[j] < arreglo[j + 1]) || (!isDes && arreglo[j] > arreglo[j + 1])) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
            if (muestraPasos) {
                System.out.print("Iteración " + (i + 1) + ": ");
                imprimirArreglo(arreglo);
            }
        }
    }
    
    public void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println(); // Salto de línea 
    }
}
