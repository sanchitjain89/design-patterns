package strategy;

class BicycleNavigationStrategy implements NavigationStrategy {
    @Override
    public void calculateRoute(String startPoint, String endPoint) {
        System.out.println("\nCalculating bicycle route from " + startPoint + " to " + endPoint);
        System.out.println("→ Using dedicated bike lanes and paths");
        System.out.println("→ Considering elevation changes");
        System.out.println("→ Avoiding high-traffic roads when possible");
    }

    @Override
    public int getEstimatedTime() {
        return 60; // minutes
    }

    @Override
    public double getDistance() {
        return 12.0; // kilometers
    }
}
