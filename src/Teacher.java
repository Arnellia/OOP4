import UserController.User;

public class Teacher extends User {
    private Integer teacherId;

    public Teacher(Integer teacherId, String surname, String firstname, String patronymic) {
        super();
        this.teacherId=teacherId;
    }
    public Integer getTeacherId() {
        return teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" + "teacherId=" + teacherId;
    }

    public void setFirstname(String firstname) {
    }

    public void setSurname(String surname) {

    }
}
