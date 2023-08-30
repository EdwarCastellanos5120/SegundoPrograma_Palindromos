package org.example;

public class Palindromos {

    public boolean verificarPalabra(String cadena){
        cadena = cadena.replace(" ", "").toLowerCase();
        int longitud = cadena.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (cadena.charAt(i) != cadena.charAt(longitud - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
