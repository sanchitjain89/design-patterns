package builder.first;

public class BuilderDemo {

    public static void main(String[] args) {
        Computer gaming = new Computer.ComputerBuilder("Intel i7", "16GB")
                .enableBluetooth(true)
                .build();

        System.out.println(gaming);
    }
}
