package es.hulk.fitxers.access;

import es.hulk.fitxers.menu.Menu;
import es.hulk.fitxers.types.Article;
import es.hulk.fitxers.types.StorageIO;
import es.hulk.fitxers.utils.Utils;

import java.io.IOException;
import java.util.Scanner;

public class Administrator {

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
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                addMenu();
                break;
            case 2:
                deleteArticleMenu();
                break;
            case 3:
                Editor.editMenu();
                break;
            case 4:
                Username.readArticles();
                break;
            case 5:
                Menu.firstMenu();
                break;
        }
    }

    public static void addMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        StorageIO storage = new StorageIO("article.txt", "rw");
        Article article = new Article();

        addId();

        Utils.line("Posa un nom a l'article");
        article.setName(scanner.nextLine());

        Utils.space();

        Utils.line("Posa una descripcio a l'article");
        article.setDescription(scanner.nextLine());

        Utils.space();

        Utils.line("Posa un stock a l'article");
        article.setStock(scanner.nextInt());

        Utils.space();

        Utils.line("Vols que estigui disponible?¿ (true / false): ");
        article.setActive(scanner.nextBoolean());

        Utils.space();

        Utils.line("Posa un preu a l'article");
        article.setPrice(scanner.nextInt());

        Utils.space();

        storage.add(article);
        Utils.newLine("Article afegit");
    }

    public static void deleteArticleMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        Article article = new Article();
        StorageIO storage = new StorageIO("article.txt", "rw");

        Utils.line("Id de l'article que vol borrar");
        int get = scanner.nextInt();
        get = article.getId();

        storage.deleteArticle(article);
        adminMenu();
    }

    public static void addId() throws IOException {
        Article article = new Article();
        int counter = 1;
        article.setId(0);


    }
}
