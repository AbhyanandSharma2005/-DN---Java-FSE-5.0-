public class LibraryTest {

    public static void main(String[] args) {

        // Books sorted alphabetically by title
        Book[] books = {

            new Book(
                    101,
                    "Algorithms",
                    "Robert Sedgewick"),

            new Book(
                    102,
                    "Clean Code",
                    "Robert Martin"),

            new Book(
                    103,
                    "Data Structures",
                    "Mark Allen Weiss"),

            new Book(
                    104,
                    "Java Programming",
                    "Herbert Schildt"),

            new Book(
                    105,
                    "Operating Systems",
                    "Galvin")
        };

        System.out.println("Linear Search:");

        Book result1 =
                SearchLibrary.linearSearch(
                        books,
                        "Java Programming");

        if (result1 != null) {

            System.out.println(result1);
        }
        else {

            System.out.println("Book Not Found");
        }

        System.out.println("\nBinary Search:");

        Book result2 =
                SearchLibrary.binarySearch(
                        books,
                        "Java Programming");

        if (result2 != null) {

            System.out.println(result2);
        }
        else {

            System.out.println("Book Not Found");
        }
    }
}