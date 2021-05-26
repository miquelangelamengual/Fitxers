package es.hulk.fitxers.types;

import es.hulk.fitxers.ex.Student;

import java.io.IOException;
import java.io.RandomAccessFile;

public class StorageIO {

    private static final int MAX_SIZE = 1 + (Article.getMaxStringName() * 2) + (Article.getMaxStringDesc() * 2) + 4 + 4;

    /**
     * BOOLEAN + NAME + DESCRIPCIO + STOCK + PREU + CATEGORIA
     * 1        20         120        4       4       10
     **/

    private final RandomAccessFile randomAccessFile;

    public StorageIO(String fileName, String mode) throws IOException {
        randomAccessFile = new RandomAccessFile(fileName, mode);
    }

    public void add(Article article) throws IOException {
        randomAccessFile.seek(randomAccessFile.length());
        randomAccessFile.writeInt(article.getId());
        randomAccessFile.writeBoolean(article.isActive());
        randomAccessFile.writeChars(article.getAdjustedName());
        randomAccessFile.writeChars(article.getAdjustedDescription());
        randomAccessFile.writeDouble(article.getPrice());
        randomAccessFile.writeInt(article.getStock());
        randomAccessFile.writeChars(String.valueOf(article.getCategory()));
    }

    public Article getArticle(int id) throws IOException {
        int index = getIndex(id);
        randomAccessFile.seek((long) index * MAX_SIZE);
        return readArticle();
    }

    private Article readArticle() throws IOException {
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

    public void deleteArticle(Article article) throws IOException {
        article = null;
        //Setting file pointer to start of file
        randomAccessFile.seek(0);
        String data = randomAccessFile.readLine();
        while (data != null) {
            if (article != null && article.equals(article)) {
                String blankData = "";
                randomAccessFile.writeBytes(blankData);
                break;
            }
            data = randomAccessFile.readLine();
        }
    }

    public void viewAllArticle() throws IOException {
        String data;
        randomAccessFile.seek(0);
        data = randomAccessFile.readLine();
        System.out.println(data);
        while (data != null) {
            data = randomAccessFile.readLine();
            System.out.println(data);
        }
    }

    private int getIndex(int id) throws IOException {
        for (int i = 0; i < getCount(); i++) {
            randomAccessFile.seek((long) i * MAX_SIZE + 1);
            if (id == randomAccessFile.readInt()) {
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
