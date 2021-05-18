package es.hulk.fitxers.menu;

import es.hulk.fitxers.login.Login;
import es.hulk.fitxers.utils.Color;
import es.hulk.fitxers.utils.Utils;

import java.util.Scanner;

public class Menu {

    public static void firstMenu() {
        Scanner scanner = new Scanner(System.in);
        Utils.newLine(Color.strikethrough + "--------------------------");
        Utils.newLine("Practica 3 - Login");
        Utils.newLine("");
        Utils.newLine("1 - Login");
        Utils.newLine("2 - Register");
        Utils.newLine("");
        Utils.newLine("3 - Surt del programa");
        Utils.newLine(Color.strikethrough + "--------------------------");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                loginMenu();
                break;
            case 2:
                registerMenu();
                break;
            case 3:
                System.exit(404);
                break;
        }
    }

    public static void loginMenu() {
        Scanner scanner = new Scanner(System.in);
        Utils.newLine("");
        Utils.newLine("Practica 3 - Login");
        Utils.newLine("");

        Utils.line("Nom de usuari: ");
        String user = scanner.nextLine();

        Utils.line("Contrassenya: ");
        String pass = scanner.nextLine();

        Login login = new Login(user, pass);
        login.validate();
    }

    public static void registerMenu() {
        Scanner scanner = new Scanner(System.in);
        Utils.newLine("");
        Utils.newLine("Practica 3 - Register");
        Utils.newLine("");

        Utils.line("Tipo de usuari (admin o normal): ");

        Utils.line("Nom de Usuari: ");
        String username = scanner.nextLine();

        Utils.line("Contrasenya");
        String password = scanner.nextLine();
    }

}
