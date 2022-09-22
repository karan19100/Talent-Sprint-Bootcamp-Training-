
import java.io.*;
import java.util.*;

public class DataFile {

    List<Student> studentList;

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> readStudents(RandomAccessFile raf) throws IOException {
        studentList = new ArrayList<>();

        while (raf.getFilePointer() < raf.length()) {
            String[] data = raf.readLine().toString().split(":");
            Student stu = new Student();
            stu.setId(Integer.parseInt(data[0]));
            stu.setName(data[1]);
            int marksArr[] = {Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4])};
            stu.setMarks(marksArr);
            studentList.add(stu);
        }

        return studentList;
    }

}
