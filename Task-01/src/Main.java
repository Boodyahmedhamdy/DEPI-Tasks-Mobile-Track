import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        * take input from user -- username and password
        * search in 2 tables for instructor or student
        * if no result show error message and take input again
        * if found check if found in students -- show all courses
        * if found check if found in instructors -- show all students
        *
        * */
        System.out.println("Welcome to Course Center Applicaiton\n-------------------------\n");
        Scanner scanner = new Scanner(System.in);
        boolean appStillRunning = true;

        do {
            // take user name
            System.out.print("enter your user name: ");
            String username = scanner.nextLine();
            System.out.print("enter your password: ");
            String password = scanner.nextLine();

            boolean foundInInstructors = false;
            boolean foundInStudents = false;

            // search in instructors
            for (String[] instructor : DB.instructors) {
                if(username.equals(instructor[0]) && password.equals(instructor[1])) {
                    foundInInstructors = true;
                    break;
                }
            }
            // search in students
            for (Student student : DB.students) {
                if(username.equals(student.username) && password.equals(student.password)) {
                    foundInStudents = true;
                    break;
                }
            }

            if(foundInStudents) {
                // print all courses
                System.out.println("Login successful as Student");
                for (String course : DB.courses) {
                    System.out.println("- " + course);
                }
                appStillRunning = false; // to finish execution
            } else if (foundInInstructors) {
                System.out.println("Login successful as Instructor");
                // print all students
                for (Student student : DB.students) {
                    System.out.println("- " + student.username);
                }
                appStillRunning = false;// to finish execution
            } else {
                System.out.println("wrong username or password, try again!!");
            }

        } while(appStillRunning);
    }
}
