package es.hulk.fitxers.menu;

import es.hulk.fitxers.login.Login;
import es.hulk.fitxers.utils.Utils;

import java.util.Scanner;

public class Menu {

    private static Scanner scanner = new Scanner(System.in);

    public static void firstMenu() {
        Utils.newLine("");
        Utils.newLine("Practica 3 - Fitxers d'access Aleatoris");
        Utils.newLine("");

        Utils.line("Nom de usuari: ");
        String user = scanner.nextLine();

        Utils.line("Contrassenya: ");
        String pass = scanner.nextLine();

        Login login = new Login(user, pass);
        login.validate();
    }

}
