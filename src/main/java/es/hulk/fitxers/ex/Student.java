package es.hulk.fitxers.ex;

public class Student {

    private boolean active; // 1 byte
    private int id; // 4 bytes
    private String name; // MAX_STRING * 2 = 40 bytes

    private static final int MAX_STRING = 20; // màxima longitud d'un String

    public Student(boolean active, int id, String name) {
        this.active = true;
        this.id = id;
        this.name = name;
    }

    public Student() {}

    public String getAdjustedName() {
        String adjustedName = this.name;
        if (adjustedName.length() > MAX_STRING) {
            adjustedName = adjustedName.substring(0, MAX_STRING);
            return adjustedName;
        }
        for (int i = this.name.length(); i < MAX_STRING; i++) {
            adjustedName += " ";
        }
        return adjustedName;
    }

    public static int getMaxString() {
        return MAX_STRING;
    }

    public boolean isActive() {
        return active;
    }

    private String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    /*public double getAverage() {
        return average;
    }*/

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    /*public void setAverage(double average) {
        this.average = average;
    }*/

    @Override
    public String toString() {
        return "Student{" +
                "active=" + active +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
