import java.util.List;

public class EducationalGroupService {
    public StudyGroup createStudyGroup (Teacher teacher, List<Student> students){
        return new StudyGroup (teacher, students);
    }
}
