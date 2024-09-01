package ui;
import model.Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

//Suma de dos números: Escribe un programa que solicite
// al usuario dos números e imprima su suma.
public class Main {

    private static final Ejercicios ejercicios = new Ejercicios();


    public static void main(String[] args) {

        Scanner read=new Scanner(System.in);

        int opc;
        do {
            // Mostrar las opciones del menú
            System.out.println("===== MENÚ =====");
            System.out.println("1. Calculadora 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
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
                    break;
                case 3:
                    System.out.println("Has elegido la Opción 3.");
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

}