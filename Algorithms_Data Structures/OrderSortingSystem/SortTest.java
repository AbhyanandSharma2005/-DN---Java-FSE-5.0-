public class SortTest {

    public static void main(String[] args) {

        Order[] orders = {

            new Order(
                    101,
                    "Rahul",
                    4500),

            new Order(
                    102,
                    "Amit",
                    2500),

            new Order(
                    103,
                    "Sneha",
                    7800),

            new Order(
                    104,
                    "Priya",
                    3200),

            new Order(
                    105,
                    "Vikas",
                    6000)
        };

        System.out.println(
                "Original Orders:");

        SortOperations.displayOrders(
                orders);


        SortOperations.bubbleSort(
                orders);

        System.out.println(
                "\nAfter Bubble Sort:");

        SortOperations.displayOrders(
                orders);


        orders = new Order[]{

            new Order(101, "Rahul", 4500),
            new Order(102, "Amit", 2500),
            new Order(103, "Sneha", 7800),
            new Order(104, "Priya", 3200),
            new Order(105, "Vikas", 6000)
        };

        SortOperations.quickSort(
                orders,
                0,
                orders.length - 1);

        System.out.println(
                "\nAfter Quick Sort:");

        SortOperations.displayOrders(
                orders);
    }
}