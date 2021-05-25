package es.hulk.fitxers.access;

import es.hulk.fitxers.menu.Menu;
import es.hulk.fitxers.utils.Utils;

import java.io.IOException;
import java.util.Scanner;

public class Editor {

    public static void editMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        Utils.bar();
        Utils.newLine(" Mode Administrador - Editar");
        Utils.space();
        Utils.newLine("1 - Editar Id");
        Utils.newLine("2 - Editar disponibilitat");
        Utils.newLine("3 - Editar Nom");
        Utils.newLine("4 - Editar Descripcio");
        Utils.newLine("5 - Editar Stock");
        Utils.newLine("6 - Editar Preu");
        Utils.space();
        Utils.newLine("7 - Tornar enrere");
        Utils.bar();
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                editId();
                break;
            case 2:
                editActive();
                break;
            case 3:
                editName();
                break;
            case 4:
                editDescription();
                break;
            case 5:
                editStock();
                break;
            case 6:
                editPrice();
                break;
            case 7:
                Menu.firstMenu();
                break;
        }
    }

    public static void editId() {

    }

    public static void editActive() {

    }

    public static void editName() {

    }

    public static void editDescription() {

    }

    public static void editStock() {

    }

    public static void editPrice() {

    }

}
