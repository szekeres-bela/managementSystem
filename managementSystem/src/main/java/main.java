import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        //Am creat studenti si profesorul
        Student studentBela = new Student(1, "Szekeres Bela");
        Student studentCatalin = new Student(2, "Dura Catalin");
        Teacher teacherPop = new Teacher(1, "Pop Nelu");
        //Am creat un curs, unde i-am asignat cursului un profesor si un curricula;
        Course courseOop = new Course("oop");
        teacherPop.teachCourse(courseOop);
        teacherPop.defineCuricula(courseOop, "curricula");
        //Da un student enroll;
        studentBela.enrollACourse(courseOop);
        //Profesorul da attend la un student:
        teacherPop.attendAStudent(courseOop, studentBela);
        //Profesorul da o nota la un student:
        teacherPop.giveGrade(studentBela, courseOop, Grades.ZECE);
        //Studentul verifica notele;
        Map<Course,Grades> grades = studentBela.getGradeList();
        for (Map.Entry<Course,Grades> grade : grades.entrySet())
            System.out.println("Course = " + grade.getKey().getName() +
                    ", Grade = " + grade.getValue());
    }
}
