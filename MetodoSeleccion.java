public class MetodoSeleccion {
    public void ordenar(int[] arreglo, boolean inDes, boolean muestraPasos) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceExtremo = i;
            for (int j = i + 1; j < n; j++) {
                if ((inDes && arreglo[j] > arreglo[indiceExtremo]) || (!inDes && arreglo[j] < arreglo[indiceExtremo])) {
                    indiceExtremo = j;
                }
            }
            int aux = arreglo[indiceExtremo];
            arreglo[indiceExtremo] = arreglo[i];
            arreglo[i] = aux;
            
            if (muestraPasos) {
                System.out.print("Iteración " + (i + 1) + ": ");
                imprimirArreglo(arreglo);
            }
        }
    }

    public void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}
