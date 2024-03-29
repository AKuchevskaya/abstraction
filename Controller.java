import java.util.List;

public class Controller {
    private EducationalGroupService service;
    public Controller(EducationalGroupService service) {
        this.service = service;
    }
    public StudyGroup createStudyGroup (Teacher teacher, List<Student> students){
        // // Логика для получения объектов Teacher и списка объ
        // Teacher teacher = teacherService.getTeacherById(teacherId);
        // List<Student> students = studentService.getStudentsById(studentIds);
        // Формирование учебной группы
        // StudyGroup studyGroup = educationalGroupService.createStudyGroup(teacher, students);
        // // Дальнейшие действия с учебной группой
        // // Например, вывод информации о группе
        // System.out.println ("учебная группа создана: " + studyGroup);

         return service.createStudyGroup(teacher, students);

    }

}