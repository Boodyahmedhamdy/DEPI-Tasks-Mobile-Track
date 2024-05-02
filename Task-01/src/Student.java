public class Student extends User {

    public Student(String username, String password) {
        this.username = username;
        this.password = password;
        this.role = UserRole.STUDENT;
    }
}
