package stratigies.navigation;

import stratigies.Route;

public class OnFootNavigationStrategy implements NavigationStrategy{
    @Override
    public Double navigateFromTo(String source, String destination) {
        System.out.println("Navigating from" + source + " to " + destination + " ON Foot");
        return 10.0;
    }

    @Override
    public Route navigateFromToWithRoute(String source, String destination) {
        return new Route(source, destination, 10.0);
    }
}
