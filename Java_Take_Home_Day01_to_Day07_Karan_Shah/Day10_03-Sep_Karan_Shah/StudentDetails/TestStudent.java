
import java.util.*;
import java.io.*;

public class TestStudent {

    public static void main(String args[]) {
        DataFile DataFile = new DataFile();

        RandomAccessFile file;
        try {
            file = new RandomAccessFile("/Users/karanshah/Documents/Java programs pratice/Day10/src/com/npci/training/java/FileHandling/StudentDetails/inputFile.txt", "rw");
            List<Student> listStu = DataFile.readStudents(file);
            for(Student stu:listStu) {
                System.out.println(stu+" total Marks: "+stu.getTotalMarks());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
