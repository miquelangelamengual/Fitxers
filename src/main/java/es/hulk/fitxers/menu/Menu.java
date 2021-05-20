package es.hulk.fitxers.menu;

import es.hulk.fitxers.login.Login;
import es.hulk.fitxers.utils.Color;
import es.hulk.fitxers.utils.Utils;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

    private static int option;

    public static void firstMenu() throws IOException {
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

    public static void editMenu() throws IOException{
        Scanner scanner = new Scanner(System.in);
        Utils.bar();
        Utils.newLine(" Mode Administrador - Editar");
        Utils.space();
        Utils.newLine("1 - Editar disponibilitat");
        Utils.newLine("2 - Editar Nom");
        Utils.newLine("3 - Editar Descripcio");
        Utils.newLine("4 - Editar Stock");
        Utils.newLine("5 - Editar Preu");
        Utils.space();
        Utils.newLine("6 - Tornar enrere");
        Utils.bar();
        option = scanner.nextInt();
        switch (option) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                firstMenu();
                break;
        }
    }

}
