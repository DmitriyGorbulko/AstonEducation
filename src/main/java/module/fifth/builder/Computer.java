package module.fifth.builder;

public class Computer {
    private String cpu;
    private String gpu;
    private int ram;
    private String os;

    private Computer(ComputerBuilder builder) {
        this.cpu = builder.cpu;
        this.gpu = builder.gpu;
        this.ram = builder.ram;
        this.os = builder.os;
    }

    public String getCpu() {
        return cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public int getRam() {
        return ram;
    }

    public String getOs() {
        return os;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", ram=" + ram +
                ", os='" + os + '\'' +
                '}';
    }

    public static class ComputerBuilder {
        private String cpu;
        private String gpu;
        private int ram;
        private String os;

        public ComputerBuilder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder gpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public ComputerBuilder ram(int ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder os(String os) {
            this.os = os;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    public static ComputerBuilder builder() {
        return new ComputerBuilder();
    }
}
