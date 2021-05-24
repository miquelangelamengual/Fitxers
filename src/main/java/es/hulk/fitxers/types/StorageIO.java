package es.hulk.fitxers.types;

import java.io.IOException;
import java.io.RandomAccessFile;

public class StorageIO {

    private static final int MAX_SIZE = 1 + (Article.getMaxStringName() * 2) + (Article.getMaxStringDesc() * 2) + 4 + 4;
    // active + id + name

    /**
      * BOOLEAN + NAME + DESCRIPCIO + STOCK + PREU + CATEGORIA
      *   1        20     240          4       4       10
    **/

    private final RandomAccessFile randomAccessFile;

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

    public Article getArticle(Category category) throws IOException {
        int index = getIndex(category);
        randomAccessFile.seek((long) index * MAX_SIZE);
        return readArticle();
    }

    public Article readArticle() throws IOException {
        Article article = new Article();
        if (randomAccessFile.getFilePointer() % MAX_SIZE == 0) {
            article.setActive(randomAccessFile.readBoolean());
            article.setName(randomAccessFile.readLine());
            article.setDescription(randomAccessFile.readLine());
            article.setPrice(randomAccessFile.readDouble());
            article.setStock(randomAccessFile.readInt());
            article.setCategory(Category.valueOf(randomAccessFile.readLine()));
        }
        System.out.println(article);
        return article;
    }

    private int getIndex(Category category) throws IOException {
        for (int i = 0; i < getCount(); i++) {
            randomAccessFile.seek((long) i * MAX_SIZE + 1);
            if (category.equals(randomAccessFile.readInt())) {
                return i;
            }
        }
        return -1;
    }

    private int getCount() throws IOException {
        return (int) randomAccessFile.length() / MAX_SIZE;
    }

    public void close() throws IOException {
        randomAccessFile.close();
    }

}
