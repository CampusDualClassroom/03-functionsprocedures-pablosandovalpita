package com.campusdual.classroom;

public class Exercise {


    // TODO ↓: Tiene que devolver el siguiente mensaje: "Hola. Bienvenido " y la cadena de textos que se le pasa por parámetro.
    public static String greetings(String name) {
        return "Hola Bienvenido" + name;
    }


    // TODO ↓: Tiene que devolver el siguiente mensaje: "Ups. No pudimos validar tus datos. Tu credenciales no son correctas, " y la cadena de texto que se le pasa por parámetro
    public static String error(String name) {
        return "Ups. No pudimos validar tus datos. Tu credenciales no son correctas, " + name;
    }


    // TODO ↓: Tiene que comprobar si el usuario que recibe por parámetro es "Sebas" y su contraseña es "sebas01". Si es correcto, que muestre el mensaje de la función greetings() y si no que muestre el mensaje de la función error()
    public static void checkUser(String user, String pass) {
        if (user.equals("Sebas") && pass.equals("sebas01")) {
            System.out.println(greetings("Sebas"));
        } else {
            System.out.println(error(user));
        }
    }


    public static void main(String[] args) {
        checkUser("Sebas", "sebas01");
        checkUser("Mario","mario01");
    }
}
