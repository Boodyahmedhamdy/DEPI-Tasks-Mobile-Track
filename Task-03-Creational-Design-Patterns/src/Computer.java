import components.CPU;
import components.GPU;

public class Computer {

    private CPU cpu;
    private GPU gpu;
    private String storage;
    private String powerSupply;
    private String ram;

    private Computer(
            CPU cpu, GPU gpu, String storage, String powerSupply, String ram
    ) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.storage = storage;
        this.powerSupply = powerSupply;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu=" + cpu +
                ", gpu=" + gpu +
                ", storage='" + storage + '\'' +
                ", powerSupply='" + powerSupply + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }

    public static class Builder {
        private CPU cpu;
        private GPU gpu;
        private String storage;
        private String powerSupply;
        private String ram;

        public Builder setCpu(CPU cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setGpu(GPU gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setPowerSupply(String powerSupply) {
            this.powerSupply = powerSupply;
            return this;
        }

        public Builder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Computer build() {
            return new Computer(
                    cpu, gpu, storage, powerSupply, ram
            );
        }
    }





}
