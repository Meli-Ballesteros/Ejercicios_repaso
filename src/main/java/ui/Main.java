package ui;
import model.Burbuja;
import model.Ejercicios;
import model.Gmail;

import java.util.InputMismatchException;
import java.util.Scanner;

import static model.Burbuja.imprimirArreglo;


public class Main {

    private static final Ejercicios ejercicios = new Ejercicios();
    private static final Gmail gmail = new Gmail();
    private static final Burbuja burbuja= new Burbuja();


    public static void main(String[] args) {

        Scanner read=new Scanner(System.in);

        int opc;
        do {
            // Mostrar las opciones del menú
            System.out.println("===== MENÚ =====");
            System.out.println("1. Calculadora 1");
            System.out.println("2. Gmail 2");
            System.out.println("3. Metodo Burbuja 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            opc = read.nextInt();
            switch (opc) {
                case 1:
                    calculadora(read);

                    break;
                case 2:
                    System.out.println("Has elegido la Opción 2.");
                    validadorGmail(read);
                    break;
                case 3:
                    System.out.println("Has elegido la Opción 3.");
                    ordenarNotasEstudiantes(read);
                    break;
                case 4:
                    System.out.println("Has elegido la Opción 4.");
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intenta de nuevo.");
            }
        } while (opc != 5); // Repetir el menú hasta que el usuario elija salir

        read.close(); // Cerrar el scanner



    }

    public static void calculadora(Scanner read){
        try {
            System.out.println("Has elegido la Opción  1.");
            int num1=0, num2=0;
            System.out.println("ingrese el primer numero: ");
            num1= read.nextInt();
            System.out.println("ingrse el segundo numero: ");
            num2= read.nextInt();

            int suma = ejercicios.suma(num1,num2);
            System.out.println("resultado de la suma es : "+ suma);

            int multiplication = ejercicios.multiplication(num1,num2);
            System.out.println("resultado de la multiplicacion es : "+ multiplication);

            try{
                int division = ejercicios.division(num1,num2);
                System.out.println("resultado de la la division es : "+division);
            }catch (ArithmeticException e ){
                System.out.println("no se puede dividir por cero :( ");

            }
            int resta  = ejercicios.resta(num1,num2);
            System.out.println("el resultado de la resta es :"+ resta);

        }catch (InputMismatchException e ){
            System.out.println("por favor ingrese un numero valido.");
            read.next();
        }
    }

    public static void validadorGmail(Scanner read){

        try {
            String email;
            System.out.println("ingrese un correo electronico: ");
            read.nextLine();
            email = read.nextLine();
            gmail.validarEmail(email);

        } catch (Exception e) {
            System.out.println("ocurrio un error " + e.getMessage());
        }

    }

    public static void ordenarNotasEstudiantes(Scanner read){
        int cantidadNotas;
        System.out.println("ingrese la cantidad de notas de estudiantes que desea ordenar " );

        while(true){ // el while true es para numero positivos
            try {
                cantidadNotas= read.nextInt();
                if(cantidadNotas <= 0){
                  System.out.println("las cantidad de notas debe ser mayor a 0. intente de nuevo");
                }else{
                    break;
                }
            }catch (InputMismatchException e){
                System.out.println("Entrada no valida, porfavor ingrese un numero entero");
                read.next();// limpia la entrada no valida
            }
        }

        double notas[]= new double[cantidadNotas]; //inicializacion del arreglo

        System.out.println("Porfavor ingrese las notas de"+cantidadNotas+"los estudiantes ");
        for (int i=0; i< notas.length;i++){
            System.out.println("notas del estudiante "+ (i+1)+": ");

            while (true){
                try {
                    notas[i]= read.nextDouble();
                    if (notas[i]< 0 || notas[i] > 10){
                        System.out.println("Ingrese una nota en el valor 0 a 10");

                    }else {
                        break;
                    }
                }catch (InputMismatchException e){
                    System.out.println("Entrada no valida,intente nuevamente ingresar un numero");
                    read.next();
                }
            }
        }

        //imprimir arreglo de notas antes de ordenado
        System.out.println("Notas antes de ordenar ");
        System.out.println("Notas antes de ordenar:");
        imprimirArreglo(notas);

        // Implementar el algoritmo de burbuja para ordenar las notas en orden ascendente
        burbuja.ordenarPorBurbuja(notas);

        // Imprimir el arreglo de notas después de ordenar
        System.out.println("Notas después de ordenar:");
        imprimirArreglo(notas);




    }

}