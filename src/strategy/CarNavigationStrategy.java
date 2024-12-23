package strategy;

// Concrete strategy implementations
class CarNavigationStrategy implements NavigationStrategy {

    @Override
    public void calculateRoute(String startPoint, String endPoint) {
        // Simulation of route calculation
        System.out.println("\nCalculating car route from " + startPoint + " to " + endPoint);
        System.out.println("→ Using main roads and highways");
        System.out.println("→ Considering current traffic conditions");
        System.out.println("→ Avoiding toll roads if possible");
    }

    @Override
    public int getEstimatedTime() {
        // In real implementation, this would calculate based on distance and traffic
        return 30; // minutes
    }

    @Override
    public double getDistance() {
        return 25.5; // kilometers
    }
}
