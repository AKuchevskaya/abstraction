import java.util.List;

public class StudyGroup {
    private Teacher teacher;
    private List<Student> students;
    public StudyGroup (Teacher teacher, List<Student> students){
        this.teacher = teacher;
        this.students = students;
    }
    public List<Student> getStudents() {
        return students;
    }
    public Teacher getTeacher() {
        return teacher;
    }
    
}
