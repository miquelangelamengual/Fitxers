package es.hulk.fitxers.login;

import es.hulk.fitxers.access.TypeAccess;
import es.hulk.fitxers.menu.Menu;
import es.hulk.fitxers.utils.Utils;

public class Login {

    private String username;
    private String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /*
     * Getters
     */

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    /*
     * Setters
     */

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void validate() {
        checkEmpty();
        Register reg = new Register();
        if (getUsername().equals(reg.getAdmins().get(username)) && getPassword().equals(reg.getAdmins().get(password))) {
            TypeAccess.administrator();
            Utils.newLine("Admin");
        }
        if (getUsername().equals(reg.getNormal().get(username)) && getUsername().equals(reg.getNormal().get(password))) {
            TypeAccess.normalAccess();
            Utils.newLine("Normal");
        } else {
            Utils.newLine("No Funciona");
        }
    }

    public void checkEmpty() {
        if (getPassword().isEmpty() && getUsername().isEmpty()) {
            Utils.line("El Nom de Usuari i Contrassenya introduits estan buits, torna-ho a intentar");
            Menu.firstMenu();
        }

        if (getUsername().isEmpty()) {
            Utils.line("Nom de Usuari incorrecte, torna-ho a intentar");
            Menu.firstMenu();
        }

        if (getPassword().isEmpty()) {
            Utils.line("Contrassenya buida, torna-ho a intentar");
            Menu.firstMenu();
        }
    }
}
