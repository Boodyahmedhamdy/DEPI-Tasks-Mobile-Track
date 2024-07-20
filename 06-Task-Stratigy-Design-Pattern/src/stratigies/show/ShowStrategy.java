package stratigies.show;

import stratigies.Route;

public interface ShowStrategy {
    void showFromTo(String source, String destination);
    void showRoute(Route route);
}
