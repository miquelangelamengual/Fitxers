package es.hulk.fitxers.access;

import es.hulk.fitxers.types.Article;
import es.hulk.fitxers.types.Stock;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;

public class Administrator {

    private static int MAXIMUM_SIZE;

    private RandomAccessFile file;

    public Administrator(String fileName, String mode) throws FileNotFoundException {
        file = new RandomAccessFile(fileName, mode);
    }


    public void add() throws IOException {
        Article article = new Article();
        file.seek(file.length());
        file.writeChars(article.getName());
        file.writeChars(article.getDescription());
        file.writeDouble(article.getPrice());
    }

    public void remove() throws IOException {

    }

    public void edit() throws IOException {

    }

}
