package builder;

// Usage example
public class BuilderDemo {
    public static void main(String[] args) {
        Computer gaming = new Computer.ComputerBuilder("Intel i7", "16GB")
                .setStorage("1TB SSD")
                .enableGraphicsCard(true)
                .enableBluetooth(true)
                .build();

        System.out.println("Gaming Computer: " + gaming);
    }
}
