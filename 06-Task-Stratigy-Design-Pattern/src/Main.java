import stratigies.navigation.CarNavigationStrategy;
import stratigies.navigation.OnFootNavigationStrategy;
import stratigies.show.InfraredShowStrategy;
import stratigies.show.SatelliteShowStrategy;

public class Main {
    public static void main(String[] args) {
        GoogleMap googleMap = new GoogleMap();
        String source = "helwan";
        String destination = "6 October";

        googleMap.setSource(source);
        googleMap.setDestination(destination);

        googleMap.setNavigationStrategy(new CarNavigationStrategy());
        googleMap.setShowStrategy(new SatelliteShowStrategy());

        googleMap.testMap();

        googleMap.setShowStrategy(new InfraredShowStrategy());
        googleMap.setNavigationStrategy(new OnFootNavigationStrategy());

        googleMap.testMap();
    }
}
