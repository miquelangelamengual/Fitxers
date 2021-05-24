package es.hulk.fitxers.ex;

import java.io.IOException;
import java.io.RandomAccessFile;

public class StudentIO {

    private static final int STUDENT_SIZE = 1 + 4 + (Student.getMaxString() * 2); // 45
    // active + id + name

    private RandomAccessFile f;
    private long studentCount;

    public StudentIO(String fileName, String mode) throws IOException {
        f = new RandomAccessFile(fileName, mode);
    }

    /**
     * Adds a student at the end of the file.
     * @param student Student to be added.
     * @throws IOException
     */
    public void add(Student student) throws IOException {
        f.seek(f.length());
        f.writeBoolean(student.isActive());
        f.writeInt(student.getId());
        f.writeChars(student.getAdjustedName());
    }

    /**
     * Reads and returns the student identified by 'id' from the file.
     * @param id
     * @return
     * @throws IOException
     */
    public Student getStudent(int id) throws IOException {
        int index = getStudentIndex(id);
        f.seek(index * STUDENT_SIZE);
        return readStudent();
    }

    /**
     * Sets a student, identified by the param id, to false.
     * @param id Student identifier.
     * @throws IOException
     */
    public void resign(int id) throws IOException {
        int index = getStudentIndex(id);
        f.seek((long) index * STUDENT_SIZE);
        f.writeBoolean(false);
    }

    /**
     * Returns the index within the file where you can find the student
     * identified by 'id'.
     * @param id Identifier for the student you want to search.
     * @return Index of the student if found, -1 otherwise.
     * @throws IOException
     */
    private int getStudentIndex(int id) throws IOException {
        for (int i = 0; i < getStudentCount(); i++) {
            f.seek((long) i * STUDENT_SIZE + 1);
            if (id == f.readInt()) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Reads and returns a student from the current file pointer (considering
     * it is pointing at the beginning of a student).
     * @return Student read.
     */
    private Student readStudent() throws IOException {
        Student student = new Student();
        if (f.getFilePointer() % STUDENT_SIZE == 0) {
            student.setActive(f.readBoolean());
            student.setId(f.readInt());
            student.setName(readString(Student.getMaxString()));
        }
        return student;
    }

    /**
     * Displays all active students.
     * @throws IOException
     */
    public void displayActiveStudents() throws IOException {
        Student student = new Student();
        for (int i = 0; i < getStudentCount(); i++) {
            f.seek((long) i * STUDENT_SIZE);
             student = readStudent();
             if (student.isActive()) {
                 System.out.println(student);
             }
        }
    }

    private String readString(int stringLength) throws IOException{
        String name = "";
        for (int i = 0; i < stringLength; i++) {
            name += f.readChar();
        }
        return name;
    }

    private int getStudentCount() throws IOException {
        return (int) f.length() / STUDENT_SIZE;
    }

    /**
     * Closes file stream.
     * @throws IOException
     */
    public void close() throws IOException {
        f.close();
    }

}
