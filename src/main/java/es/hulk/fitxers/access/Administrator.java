package es.hulk.fitxers.access;

import es.hulk.fitxers.menu.Menu;
import es.hulk.fitxers.utils.Utils;

import java.io.IOException;
import java.util.Scanner;

public class Administrator {

    private static int option;

    public static void adminMenu() throws IOException {
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
        Utils.line("Elegeix una opcio: ");
        option = scanner.nextInt();
        switch (option) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                Menu.editMenu();
                break;
            case 4:
                break;
            case 5:
                Menu.firstMenu();
                break;
        }
    }

}
