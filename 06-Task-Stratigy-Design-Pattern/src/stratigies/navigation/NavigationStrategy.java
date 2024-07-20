package stratigies.navigation;

import stratigies.Route;

public interface NavigationStrategy {
    Double navigateFromTo(String source, String destination);
    Route navigateFromToWithRoute(String source, String destination);
}
