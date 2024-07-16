public class ComputerDirector {

    public void buildGamingComputer(Computer.Builder builder) {
        builder.setPowerSupply("gaming power supply")
                .setRam("16 GB")
                .setStorage("1T SSD");
    }

    public void buildWeakComputer(Computer.Builder builder) {
        builder
                .setStorage("265 GB")
                .setRam("4 GB")
                .setPowerSupply("weak power supply");
    }
}
