public class Main {
    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();
        LightSystem lightSystem = new LightSystem();


        TheaterFacade facade = new TheaterFacade(dvdPlayer, projector, screen, lightSystem);
        facade.playAPlay();
        System.out.println("----------------------------");

        facade.playAPlay();
        System.out.println("----------------------------");

        facade.closeAPlay();
        System.out.println("----------------------------");

        facade.closeAPlay();
    }
}
