import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private int id;
    private String fullName;
    private List<Course> enrolledCourses = new ArrayList<Course>();
    private Map<Course, Grades> gradeList = new HashMap<Course, Grades>();

    public Student(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public int getId() {
        return id;
    }

    public Map<Course, Grades> getGradeList() {
        return gradeList;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void enrollACourse(Course course){
        enrolledCourses.add(course);
        course.addStudentToList(new Student(this.id, this.fullName));
    }

    public void addGrade(Course course, Grades grade) {
        gradeList.put(course, grade);
    }
}
