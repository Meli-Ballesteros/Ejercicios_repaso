package model;

public class Ejercicios {
    public Ejercicios() {

    }

    public int suma(int num1, int num2){
        return num1+ num2;

    }

    public int multiplication(int num1, int num2){
        return num1 * num2;

    }

    public int division(int num1,int num2){
        if (num2 == 0){
            throw new ArithmeticException("no se puede dividir por cero");
        }
        return  num1/num2;

    }

    public int resta(int num1, int num2){
       return num1-num2;

    }




}
