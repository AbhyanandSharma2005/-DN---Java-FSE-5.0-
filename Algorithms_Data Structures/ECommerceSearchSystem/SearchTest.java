public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {

            new Product(
                    101,
                    "Laptop",
                    "Electronics"
            ),

            new Product(
                    102,
                    "Mouse",
                    "Electronics"
            ),

            new Product(
                    103,
                    "Keyboard",
                    "Electronics"
            ),

            new Product(
                    104,
                    "Headphones",
                    "Electronics"
            ),

            new Product(
                    105,
                    "Monitor",
                    "Electronics"
            )
        };

        System.out.println(
                "Linear Search:"
        );

        Product result1 =
                SearchOperations.linearSearch(
                        products,
                        104
                );

        System.out.println(result1);


        System.out.println(
                "\nBinary Search:"
        );

        Product result2 =
                SearchOperations.binarySearch(
                        products,
                        104
                );

        System.out.println(result2);
    }
}