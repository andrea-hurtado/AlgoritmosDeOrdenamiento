public class MetodoBurbujaMejorado {

    public void ordenar(int[] arreglo, boolean isDes, boolean muestraPasos) {
        int n = arreglo.length;
        boolean cambio;
        for (int i = 0; i < n - 1; i++) {
            cambio = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if ((isDes && arreglo[j] < arreglo[j + 1]) || (!isDes && arreglo[j] > arreglo[j + 1])) {
                    
                    // Intercambio de valores
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    cambio = true;
                }
            }
            
            if (muestraPasos) {
                System.out.print("Iteración " + (i + 1) + ": ");
                imprimirArreglo(arreglo);
            }

            if (!cambio) break; //Se acaba porque ya no se realizan mas cambios
        }
    }
    // Imprimir el estado actual del arreglo después de cada iteración
    public void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println(); // Salto de línea para presentación deseada
    }
}