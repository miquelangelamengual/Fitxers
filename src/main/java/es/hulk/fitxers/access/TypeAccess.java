package es.hulk.fitxers.access;

import es.hulk.fitxers.menu.Menu;
import es.hulk.fitxers.utils.Utils;

import java.util.Scanner;

public class TypeAccess {

    private static int option;

    public static void adminAccess() {
        Scanner scanner = new Scanner(System.in);
        Utils.bar();
        Utils.newLine(" Mode Administrador");
        Utils.space();
        Utils.newLine("1 - Inserir");
        Utils.newLine("2 - Eliminar");
        Utils.newLine("3 - Editar");
        Utils.newLine("4 - Llegir");
        Utils.space();
        Utils.newLine("5 - Torna al menu principal");
        Utils.bar();
        option = scanner.nextInt();
        switch (option) {
            case 1:
                Administrator.add();
                break;
            case 2:
                Administrator.remove();
                break;
            case 3:
                Administrator.edit();
                break;
            case 4:
                Username.read();
                break;
            case 5:
                Menu.firstMenu();
                break;
        }
    }

    public static void normalAccess() {
        Scanner scanner = new Scanner(System.in);
        Utils.bar();
        Utils.newLine(" Mode Usuari ");
        Utils.space();
        Utils.newLine("1 - Llegir");
        Utils.space();
        Utils.newLine("2 - Tornar Enrere");
        Utils.bar();
        option = scanner.nextInt();
        switch (option) {
            case 1:
                Username.read();
                break;
            case 2:
                Menu.firstMenu();
                break;
        }
    }

}
