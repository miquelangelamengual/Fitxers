package es.hulk.fitxers;

import es.hulk.fitxers.menu.Menu;
import es.hulk.fitxers.types.Article;
import es.hulk.fitxers.types.StorageIO;

import java.io.IOException;

public class Fitxers {

    public static void main(String[] args) throws IOException {
        Article article = new Article();
        article.setActive(true);
        article.setName("Mi Libro");
        article.setDescription("Luna de plutionio");
        article.setStock(20000);
        article.setPrice(20);

        StorageIO storage = new StorageIO("article.txt", "rw");
        storage.add(article);
        Menu.firstMenu();
    }

}
