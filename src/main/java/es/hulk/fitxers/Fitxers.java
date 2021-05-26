package es.hulk.fitxers;

import es.hulk.fitxers.access.Administrator;
import es.hulk.fitxers.menu.Menu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Fitxers {

    public static void main(String[] args) throws IOException {
        init();
    }

    public static void init() throws IOException {
        Menu.firstMenu();
    }

    public static void retard() throws IOException {
        File file = new File("article.txt");
        //Instantiating the StringBuffer
        StringBuffer buffer = new StringBuffer();
        //instantiating the RandomAccessFile
        RandomAccessFile raFile = new RandomAccessFile(file, "rw");
        //Reading each line using the readLine() method
        while(raFile.getFilePointer() < raFile.length()) {
            buffer.append(raFile.readLine()+System.lineSeparator());
        }
        String contents = buffer.toString();
        System.out.println("Contents of the file: \n"+contents);
    }

    public static void method() {
        try {
            // create a new RandomAccessFile with filename test
            RandomAccessFile raf = new RandomAccessFile("test.txt", "rw");

            // write something in the file
            raf.writeUTF("Hello World");

            // set the file pointer at 0 position
            raf.seek(0);

            // read the first byte and print it
            System.out.println("" + raf.read());

            // set the file pointer at 4rth position
            raf.seek(4);

            // read the first byte and print it
            System.out.println("" + raf.read());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
