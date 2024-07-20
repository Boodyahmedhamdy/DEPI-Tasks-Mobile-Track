import stratigies.Route;
import stratigies.navigation.NavigationStrategy;
import stratigies.show.ShowStrategy;

public class GoogleMap {
    private String source;
    private String destination;
    private NavigationStrategy navigationStrategy;
    private ShowStrategy showStrategy;
    private Route route;


    public GoogleMap() {

    }
    public GoogleMap(String source, String destination, NavigationStrategy navigationStrategy, ShowStrategy showStrategy) {
        this.source = source;
        this.destination = destination;
        this.navigationStrategy = navigationStrategy;
        this.showStrategy = showStrategy;
    }

    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }

    public NavigationStrategy getNavigationStrategy() {
        return navigationStrategy;
    }

    public ShowStrategy getShowStrategy() {
        return showStrategy;
    }

    public void setShowStrategy(ShowStrategy showStrategy) {
        this.showStrategy = showStrategy;
    }

    public void show() {
//        showStrategy.showFromTo(source, destination);
        if(route != null) {
            showStrategy.showRoute(route);
        } else {
            System.out.println("you should setNavigationStrategy First");
        }
    }

    public void setNavigationStrategy(NavigationStrategy navigationStrategy) {
        this.navigationStrategy = navigationStrategy;
    }

    public void navigate() {
//        navigationStrategy.navigateFromTo(source, destination);
        route = navigationStrategy.navigateFromToWithRoute(source, destination);
    }


    public void testMap() {
        navigate();
        show();
    }
}
