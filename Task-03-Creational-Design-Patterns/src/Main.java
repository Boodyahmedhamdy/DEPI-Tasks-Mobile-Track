
import components.CPU;

public class Main {

    public static void main(String[] args) {
        CPU.Builder builder = new CPU.Builder();
        builder
                .setClockSpeed(20000)
                .setCacheMemory(300)
                .setVersion(2)
                .setName("i5")
                .setBrand("intel");


        System.out.println(builder.build());
    }
}
