package es.hulk.fitxers.access;

import es.hulk.fitxers.menu.Menu;
import es.hulk.fitxers.types.Article;
import es.hulk.fitxers.types.Category;
import es.hulk.fitxers.utils.Utils;

import java.io.IOException;
import java.util.Scanner;

public class Username {

    public static void userMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        Utils.bar();
        Utils.newLine(" Mode Usuari ");
        Utils.space();
        Utils.newLine("1 - Llegir");
        Utils.space();
        Utils.newLine("2 - Tornar Enrere");
        Utils.bar();
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                break;
            case 2:
                Menu.firstMenu();
                break;
        }
    }

    public static void readArticles(Article article, Category category) throws IOException {
        switch (article.getCategory()) {
            case CATEGORIA1:

                break;
            case CATEGORIA2:
            case CATEGORIA3:
            case CATEGORIA4:
        }
    }

}
