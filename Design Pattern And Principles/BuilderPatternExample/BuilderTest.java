public class BuilderTest {


    public static void main(String[] args) {


        Computer computer1 = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("32 GB")
                .setStorage("1 TB SSD")
                .setGraphicsCard("NVIDIA RTX 4090")
                .setOperatingSystem("Windows 11")
                .build();



        computer1.showDetails();



        System.out.println();



        Computer computer2 = new Computer.Builder()
                .setCPU("Intel i3")
                .setRAM("8 GB")
                .setStorage("256 GB SSD")
                .setOperatingSystem("Ubuntu")
                .build();



        computer2.showDetails();

    }
}