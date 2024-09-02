package model;

public class Gmail {

    public void validarEmail(String email){
        if (email == null|| email.isEmpty()){
            System.out.println("el correo electronico no puede estar vacio ");
            return;

        }

        if(!email.contains("@")){
            System.out.println("El correo electronico debe contener @ ");
            return;
        }

        int position = email.indexOf("@");
        if (email.indexOf(".", position)== -1){
            System.out.println("el correo electronico debe contener un punto(.) despues de (@)");
            return;
        }

        if (email.contains(" ")){
            System.out.println("El correo no debe contenr espacios.");
            return;
        }

        System.out.println("el correo es valido");



    }

}
