public class Instructor extends User{

    public Instructor(String username, String password) {
        this.username = username;
        this.password = password;
        this.role = UserRole.INSTRUCTOR;
    }
}
