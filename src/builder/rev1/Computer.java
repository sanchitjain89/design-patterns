package builder.rev1;

public class Computer {

    private int ram;
    private String hardDisk;
    private String processor;

    public Computer(ComputerBuilder builder) {
        this.ram = builder.ram;
        this.hardDisk = builder.hardDisk;
        this.processor = builder.processor;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram +
                ", hardDisk='" + hardDisk + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }

    public static class ComputerBuilder{
        private int ram;
        private String hardDisk;
        private String processor;

        public ComputerBuilder() {
        }

        public ComputerBuilder buildRam(int ram){
            this.ram = ram;
            return this;
        }

        public ComputerBuilder buildProcessor(String processor){
            this.processor = processor;
            return this;
        }

        public ComputerBuilder addHDisk(String hardDisk){
            this.hardDisk = hardDisk;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
