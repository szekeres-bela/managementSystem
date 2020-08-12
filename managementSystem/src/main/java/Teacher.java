import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private int id;
    private String fullName;
    private List<Course> teachedCourses = new ArrayList<Course>();

    public Teacher(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public int getId() {
        return id;
    }

    public List<Course> getTeachedCourses() {
        return teachedCourses;
    }

    public void giveGrade(Student student, Course course, Grades grade) {
        student.addGrade(course, grade);
    }

    public void teachCourse(Course course){
        this.teachedCourses.add(course);
        course.setTeacher(new Teacher(this.id, this.fullName));
    }

    public void defineCuricula(Course course, String curricula){
        course.setCurricula(curricula);
    }

    public void attendAStudent(Course course, Student student) {
        course.addStudentToAttendanceList(student);
    }
}
