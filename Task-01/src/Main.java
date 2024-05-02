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

            boolean foundInInstructors = IsFoundIn(
                    DB.instructors, username, password
            );
            boolean foundInStudents =  foundInInstructors ? false : IsFoundIn(DB.students, username, password);
//            boolean foundInStudents = !foundInInstructors && IsFoundIn(DB.students, username, password); SMARTER SOLUTION

            if(foundInStudents) {
                System.out.println("Login successful as Student");
                printCourses(DB.courses);
                appStillRunning = false; // to finish execution

            } else if (foundInInstructors) {
                System.out.println("Login successful as Instructor");
                printUsers(DB.students);
                appStillRunning = false;// to finish execution
            } else {
                System.out.println("wrong username or password, try again!!");
            }

        } while(appStillRunning);
    }

    // helper function to search for Instructor/Student/AnyClassExtendsUser
    static boolean IsFoundIn(User[] users, String username, String password) {
        for (User user : users) {
            if(username.equals(user.username) && password.equals(user.password)) {
                return true;
            }
        }
        return false;
    }

    static void printCourses(Course[] courses) {
        for (Course course : courses) {
            System.out.println("- " + course.title);
        }
    }

    static void printUsers(User[] users) {
        for (User user : users) {
            System.out.println("- " + user.username);
        }
    }
}
