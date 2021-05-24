package es.hulk.fitxers.types;

import java.io.IOException;
import java.io.RandomAccessFile;

public class StorageIO {

    RandomAccessFile randomAccessFile;

    public StorageIO(String fileName, String mode) throws IOException {
        randomAccessFile = new RandomAccessFile(fileName, mode);
    }

    public void add(Article article) throws IOException {
        randomAccessFile.seek(randomAccessFile.length());
        randomAccessFile.writeBoolean(article.isActive());
        randomAccessFile.writeChars(article.getAdjustedName());
        randomAccessFile.writeChars(article.getAdjustedDescription());
        randomAccessFile.writeDouble(article.getPrice());
        randomAccessFile.writeInt(article.getStock());
        randomAccessFile.writeChars(String.valueOf(article.getCategory()));
    }

    public void read(Article article) {

    }

}
