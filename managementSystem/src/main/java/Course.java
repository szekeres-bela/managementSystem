import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private String curricula;
    private Teacher teacher;
    private List<Student> listOfStudents = new ArrayList<Student>();
    private List<Student> listOfAttendance = new ArrayList<Student>();

    public Course(String name) {
        this.name = name;
    }

    public void setCurricula(String curricula) {
        this.curricula = curricula;
    }

    public void addStudentToList(Student student) {
        listOfStudents.add(student);
    }

    public void addStudentToAttendanceList(Student student) {
        listOfAttendance.add(student);
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public String getCurricula() {
        return curricula;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getListOfStudents() {
        return listOfStudents;
    }

    public List<Student> getListOfAttendance() {
        return listOfAttendance;
    }
}
