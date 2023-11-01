import java.util.List;

import Model.StudentModel;
import Model.TeacherModel;
import View.UserView;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TeacherModel teacher = new TeacherModel("Anton Sergeevich", 50, "001");
        StudentModel student1 = new StudentModel("Ivan Petrov", 22, "k003");
        StudentModel student2 = new StudentModel("Anna Vadimovna", 20, "k005");
        UserView userView = new UserView();
        userView.saveGroup(new TeacherModel(teacher.getTeacherId()),
                (List.of(new StudentModel(student1.getStudentId()), new StudentModel(student2.getStudentId()))), "group1");
        userView.getGroup("group1");
    }
}