
import java.util.*;

public class Student {

    private String name;
    private int id;
    private int[] marks = new int[3];

    public Student() {

    }

    public Student(String name, int id, int[] marks) {
        super();
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int[] getMarks() {
        return marks;
    }
    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public int getTotalMarks() {
        return marks[0]+marks[1]+marks[2];

    }

    public String toString() {
        return "Student [name=" + name + ", id=" + id + ", marks=" + Arrays.toString(marks) + "]";
    }

}
