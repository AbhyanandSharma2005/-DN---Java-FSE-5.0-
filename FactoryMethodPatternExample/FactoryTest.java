public class FactoryTest {


    public static void main(String[] args) {


        DocumentFactory factory;


        // Creating Word document
        factory = new WordDocumentFactory();

        factory.processDocument();



        System.out.println();



        // Creating PDF document
        factory = new PdfDocumentFactory();

        factory.processDocument();



        System.out.println();



        // Creating Excel document
        factory = new ExcelDocumentFactory();

        factory.processDocument();

    }
}