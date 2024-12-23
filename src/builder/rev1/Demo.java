package builder.rev1;

public class Demo {

    public static void main(String[] args) {

        Computer computer = new Computer
                .ComputerBuilder()
                .buildRam(32)
                .build();

        System.out.println(computer);

    }
}
