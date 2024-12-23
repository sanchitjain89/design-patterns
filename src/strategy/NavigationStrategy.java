package strategy;

// Strategy interface
interface NavigationStrategy {

    void calculateRoute(String startPoint, String endPoint);

    int getEstimatedTime();

    double getDistance();
}
