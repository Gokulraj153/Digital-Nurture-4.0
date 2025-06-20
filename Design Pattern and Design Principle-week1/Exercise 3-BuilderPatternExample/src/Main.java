public class Main {
    public static void main(String[] args) {
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB").build();
        basicComputer.displayConfig();
        System.out.println();
        Computer gamingComputer = new Computer.Builder("AMD Ryzen 9", "32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 4090")
                .build();
        gamingComputer.displayConfig();
    }
}