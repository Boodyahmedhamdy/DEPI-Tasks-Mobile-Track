package stratigies.show;

import stratigies.Route;

public class InfraredShowStrategy implements ShowStrategy{
    @Override
    public void showFromTo(String source, String destination) {
        System.out.println("showing route to " + destination + " in Infrared Mode");
    }

    @Override
    public void showRoute(Route route) {
        System.out.println("showing route from "
                + route.source + " to "
                + route.destination +
                "in Infrared Mode will take "
                + route.time + " hours");
    }
}
