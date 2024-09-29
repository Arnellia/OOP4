import java.util.List;

public class TeacherView implements TeacherView1 {
    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher teacher : list) {
            System.out.println(teacher);
        }
    }
}
