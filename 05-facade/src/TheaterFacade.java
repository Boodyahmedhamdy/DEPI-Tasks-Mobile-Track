public class TheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private Screen screen;
    private LightSystem lightSystem;

    private boolean isOpen = false;

    public TheaterFacade(DVDPlayer dvdPlayer, Projector projector, Screen screen, LightSystem lightSystem) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.screen = screen;
        this.lightSystem = lightSystem;
    }

    public void playAPlay() {
        if(!isOpen) {
            System.out.println("starting play....");
            dvdPlayer.turnOn();
            projector.playVideo();
            screen.turnOn();
            lightSystem.lightsOn();
            isOpen = true;
            System.out.println("theater is ready");
        } else {
            System.out.println("theater is already open");
        }

    }

    public void closeAPlay() {
        if(isOpen) {
            System.out.println("closing the play...");
            dvdPlayer.turnOff();
            projector.stopVideo();
            screen.turnOff();
            lightSystem.lightsOff();
            isOpen = false;
            System.out.println("play was closed");
        } else {
            System.out.println("theater is already closed");
        }
    }
}
