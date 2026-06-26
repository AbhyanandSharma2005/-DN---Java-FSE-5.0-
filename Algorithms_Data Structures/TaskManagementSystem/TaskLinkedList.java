public class TaskLinkedList {

    private Task head;

    public void addTask(Task task) {

        if (head == null) {

            head = task;
        }
        else {

            Task temp = head;

            while (temp.next != null) {

                temp = temp.next;
            }

            temp.next = task;
        }

        System.out.println("Task Added Successfully");
    }

    public Task searchTask(int taskId) {

        Task temp = head;

        while (temp != null) {

            if (temp.taskId == taskId) {

                return temp;
            }

            temp = temp.next;
        }

        return null;
    }

    public void traverseTasks() {

        System.out.println("\nTask List:");

        Task temp = head;

        while (temp != null) {

            System.out.println(temp);

            temp = temp.next;
        }
    }

    public void deleteTask(int taskId) {

        if (head == null) {

            System.out.println("Task List is Empty");
            return;
        }

        if (head.taskId == taskId) {

            head = head.next;

            System.out.println("Task Deleted Successfully");
            return;
        }

        Task current = head;

        while (current.next != null &&
               current.next.taskId != taskId) {

            current = current.next;
        }

        if (current.next == null) {

            System.out.println("Task Not Found");
        }
        else {

            current.next = current.next.next;

            System.out.println("Task Deleted Successfully");
        }
    }
}