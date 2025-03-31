import java.util.Scanner;

public class App {
    public static void imprimirArreglo(int[] arreglo) {
    for (int num : arreglo) {
        System.out.print(num + " ");
    }
    System.out.println();
}
    public static void main(String[] args) {
        int[] arreglo = {12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3, 27, -30, 14, 7, -1, 41, 20, -11, 8}; //arreglo a ordenar
        MetodoBurbuja metodoBurbujaClase = new MetodoBurbuja();
        MetodoSeleccion metodoSeleccion = new MetodoSeleccion();
        MetodoInsercion metodoInsercion = new MetodoInsercion();
        MetodoBurbujaMejorado metodoBurbujaMejorado = new MetodoBurbujaMejorado();

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            // Mostrar menú de opciones
            System.out.println("Seleccione el método de ordenamiento deseado: ");
            System.out.println("1. Burbuja");
            System.out.println("2. Selección");
            System.out.println("3. Inserción");
            System.out.println("4. Burbuja Mejorado");
            System.out.println("5. Salir");

            int metodo = scanner.nextInt();

            if (metodo == 5) {
                System.out.println("Hasta pronto!");
                continuar = false;
                break;
            }
            

            // Elija la orden ascendente o descendente
            System.out.println("Escoja la opción ordenar ascendentemente (A) o descendentemente (B): ");
            String orden = scanner.next();
            boolean ascendente = orden.equalsIgnoreCase("A");
            
            
            // Preguntar si desea ver los pasos
            System.out.println("¿Desea ver los pasos? (true/false): ");
            boolean muestraPasos = scanner.nextBoolean();

            // Arreglo sin modificar para ver que se va ordenando 
            int[] arregloOriginal = arreglo.clone();
            System.out.println("Arreglo original:");
            imprimirArreglo(arregloOriginal);

            int contComparaciones = 0;

            switch (metodo) {
                case 1:
                    System.out.println("Método Burbuja");
                    metodoBurbujaClase.ordenar(arregloOriginal, ascendente, muestraPasos);
                    break;

                case 2:
                    System.out.println("Método Selección");
                    metodoSeleccion.ordenar(arregloOriginal, ascendente, muestraPasos);
                    break;

                case 3:
                    System.out.println("Método Inserción");
                    metodoInsercion.ordenar(arregloOriginal, ascendente, muestraPasos);
                    break;

                case 4:
                    System.out.println("Método Burbuja Mejorado");
                    metodoBurbujaMejorado.ordenar(arregloOriginal, ascendente, muestraPasos);
                    break;

                default:
                    System.out.println("Opción incorrecta, intente nuevamente.");
                    continue;
            }
            //Arreglo completamente ordenado 
            System.out.println("Arreglo ordenado");
            imprimirArreglo(arregloOriginal);
            System.out.println("Comparaciones realizadas: " + contComparaciones);
        }
        scanner.close();
    }
}

