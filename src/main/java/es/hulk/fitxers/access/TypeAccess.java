package es.hulk.fitxers.access;

import es.hulk.fitxers.utils.Utils;

import java.io.IOException;

public class TypeAccess {

    public static void adminAccess() throws IOException {
        Utils.line("Has iniciat sesio com a usuari administrador");
        Administrator.adminMenu();
    }

    public static void normalAccess() throws IOException {
        Utils.line("Has iniciat sesio com a usuari normal");
        Username.userMenu();
    }

}
