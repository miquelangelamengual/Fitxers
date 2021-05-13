package es.hulk.fitxers.login;

import es.hulk.fitxers.menu.Menu;

import java.util.ArrayList;
import java.util.HashMap;

public class Register {

    private HashMap<String, String> admins = new HashMap<>();
    private HashMap<String, String> normal = new HashMap<>();
    private String username;
    private String password;

    public Register() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public HashMap<String, String> getAdmins() {
        return admins;
    }

    public void setAdmins(HashMap<String, String> admins) {
        this.admins = admins;
    }

    public HashMap<String, String> getNormal() {
        return normal;
    }

    public void setNormal(HashMap<String, String> normal) {
        this.normal = normal;
    }

    public void registerUser(String type) {
        if (type.equals("admin")) {
            admins.put(username, password);
        }
        if (type.equals("normal")) {
            normal.put(username, password);
        }
        System.out.println(normal);
        System.out.println(admins);
        Menu.firstMenu();
    }
}
