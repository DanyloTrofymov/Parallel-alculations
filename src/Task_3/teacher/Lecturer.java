package Task_3.teacher;

import Task_3.GradeJournal;
import Task_3.Group;

import java.util.List;

public class Lecturer extends AbstractTeacher {
    public Lecturer(String name, String surname, Group[] groups, GradeJournal gradeJournal) {
        super(name, surname, groups, gradeJournal);
    }
}