package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase para verificar si es palindromo");
        String cadena = scanner.nextLine();
        Palindromos palindromos = new Palindromos();
        if (palindromos.verificarPalabra(cadena)) {
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo");
        }
    }
}