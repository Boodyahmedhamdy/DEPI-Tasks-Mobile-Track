package stratigies.navigation;

import stratigies.Route;

public class CarNavigationStrategy implements NavigationStrategy {
    @Override
    public Double navigateFromTo(String source, String destination) {
        System.out.println("Navigating from " + source + " to " + destination + " by car");
        return 1.0;
    }

    @Override
    public Route navigateFromToWithRoute(String source, String destination) {
        return new Route(source, destination, 1.0);
    }
}
