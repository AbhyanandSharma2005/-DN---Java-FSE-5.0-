public class MVCTest {

    public static void main(String[] args) {

        Student student =
                new Student(
                        "Abhyanand",
                        101,
                        "A"
                );

        StudentView view =
                new StudentView();

        // Create Controller
        StudentController controller =
                new StudentController(
                        student,
                        view
                );

        System.out.println("Initial Student Details:");
        controller.updateView();

        controller.setStudentName("Abhyanand Sharma");
        controller.setStudentGrade("A+");


        System.out.println(
                "\nUpdated Student Details:"
        );

        controller.updateView();
    }
}