import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EducationalGroupService service = new EducationalGroupService();

        Teacher teacher = new Teacher("1. ", "Петр Евгеньевич");
        List<Student> students = new ArrayList<> ();
        students.add(new Student ("1. ", "Иванов Иван"));
        students.add(new Student ("2. ", "Петров Петр"));
        students.add(new Student ("3. ", "Сидоров Сидор"));

        Controller controller = new Controller(service);
        StudyGroup group = controller.createStudyGroup(teacher, students);

        System.out.println("Преподаватель: " + group.getTeacher().getName());

        System.out.println("Студенты:");
        for (Student student : group.getStudents()) {
            System.out.println(student.getName());
        }
    }
}
