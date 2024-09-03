package model;

public class Burbuja {

    public void ordenarPorBurbuja(double[] arreglo) {
        int n = arreglo.length;
        boolean intercambiado;

        for (int i = 0; i < (n - 1);i++){
            for(int j = 0 ; j<(n-1);j++){   // ordena el arreglo  e intercambia los numeros
                if (arreglo[j]> arreglo[j+1]){  // si numeroActual > numeroSiguiente
                    double aux = arreglo[j];
                    arreglo[j]= arreglo[j+1];
                    arreglo[j+1]= aux;
                }

            }
        }

    }

    public static void imprimirArreglo(double[] arreglo) {
        for (double nota : arreglo) {
            System.out.print(nota + " ");
        }
        System.out.println();
    }

}
