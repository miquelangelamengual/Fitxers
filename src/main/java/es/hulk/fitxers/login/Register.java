package es.hulk.fitxers.login;

import es.hulk.fitxers.menu.Menu;

import java.util.ArrayList;
import java.util.HashMap;

public class Register {

    private HashMap<String, Login> admins = new HashMap<>();
    private HashMap<String, Login> normal = new HashMap<>();
    private String type;
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

    public HashMap<String, Login> getAdmins() {
        return admins;
    }

    public void setAdmins(HashMap<String, Login> admins) {
        this.admins = admins;
    }

    public HashMap<String, Login> getNormal() {
        return normal;
    }

    public void setNormal(HashMap<String, Login> normal) {
        this.normal = normal;
    }

    public void registerUser(String type) {
        if (type.equals("admin")) {
            Login admin = new Login();
            admin.setUsername(username);
            admin.setPassword(password);
            admins.put("admin", admin);
        }
        if (type.equals("normal")) {
            Login user = new Login();
            user.setUsername(username);
            user.setPassword(password);
            normal.put("normal", user);
        }
        Menu.firstMenu();
    }
}
