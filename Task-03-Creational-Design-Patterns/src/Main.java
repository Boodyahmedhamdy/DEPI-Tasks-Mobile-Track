
import components.CPU;
import components.GPU;

public class Main {

    public static void main(String[] args) {
        CPU.Builder cpuBuilder = new CPU.Builder();
        cpuBuilder
                .setClockSpeed(20000)
                .setCacheMemory(300)
                .setVersion(2)
                .setName("i5")
                .setBrand("intel");
        System.out.println(cpuBuilder.build());


        GPU.Builder gpuBuilder = new GPU.Builder();
        gpuBuilder
                .setName("quadro")
                .setBrand("nVidia")
                .setVersion(2001);

        Computer pc = new Computer.Builder()
                .setCpu(cpuBuilder.build())
                .setGpu(gpuBuilder.build())
                .setRam("8 GB")
                .setStorage("500 GB")
                .setPowerSupply("good power supply")
                .build();

        System.out.println(pc);

        // director
        ComputerDirector director = new ComputerDirector();
        Computer.Builder computerBuilder = new Computer.Builder();
        director.buildGamingComputer(computerBuilder);
        Computer gammingComputer = computerBuilder.build();
        System.out.println(gammingComputer);
    }
}
