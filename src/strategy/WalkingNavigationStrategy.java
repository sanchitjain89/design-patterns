package strategy;

class WalkingNavigationStrategy implements NavigationStrategy {

    @Override
    public void calculateRoute(String startPoint, String endPoint) {
        System.out.println("\nCalculating walking route from " + startPoint + " to " + endPoint);
        System.out.println("→ Using pedestrian paths and walkways");
        System.out.println("→ Avoiding highways and unsafe areas");
        System.out.println("→ Including crosswalks and pedestrian bridges");
    }

    @Override
    public int getEstimatedTime() {
        return 120; // minutes
    }

    @Override
    public double getDistance() {
        return 8.5; // kilometers
    }
}
