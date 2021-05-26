package es.hulk.fitxers.menu;

import es.hulk.fitxers.login.Login;
import es.hulk.fitxers.utils.Utils;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

    public static void firstMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        Utils.newLine("");
        Utils.newLine("Practica 3 - Fitxers d'access aleatori");
        Utils.newLine("");

        Utils.line("Nom de usuari: ");
        String user = scanner.nextLine();

        Utils.line("Contrassenya: ");
        String pass = scanner.nextLine();

        Login login = new Login(user, pass);
        login.validate();
    }

}
