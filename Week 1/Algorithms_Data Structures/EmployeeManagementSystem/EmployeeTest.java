public class EmployeeTest {

    public static void main(String[] args) {

        EmployeeManager manager =
                new EmployeeManager(5);

        manager.addEmployee(
                new Employee(
                        101,
                        "Rahul",
                        "Manager",
                        60000));

        manager.addEmployee(
                new Employee(
                        102,
                        "Priya",
                        "Developer",
                        50000));

        manager.addEmployee(
                new Employee(
                        103,
                        "Amit",
                        "Tester",
                        40000));

        manager.traverseEmployees();

        System.out.println(
                "\nSearching Employee:");

        Employee emp =
                manager.searchEmployee(102);

        if (emp != null) {

            System.out.println(emp);
        }
        else {

            System.out.println("Employee Not Found");
        }

        System.out.println();

        manager.deleteEmployee(102);

        manager.traverseEmployees();
    }
}