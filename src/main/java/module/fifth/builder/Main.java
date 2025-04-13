package module.fifth.builder;

public class Main {
    public static void main(String[] args) {
        Computer computer = Computer.builder()
                .cpu("Intel Core I9")
                .gpu("NVIDIA GeForce RTX 4060TI")
                .ram(8)
                .os("Windows 10")
                .build();

        System.out.println(computer);
    }
}

