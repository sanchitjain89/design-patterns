package strategy;

// Context class
class NavigationSystem {
    private NavigationStrategy navigationStrategy;
    private String startPoint;
    private String endPoint;

    public void setNavigationStrategy(NavigationStrategy strategy) {
        this.navigationStrategy = strategy;
    }

    public void setRoute(String startPoint, String endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public void navigate() {
        if (navigationStrategy == null) {
            throw new IllegalStateException("Navigation strategy not set");
        }

        navigationStrategy.calculateRoute(startPoint, endPoint);
        int time = navigationStrategy.getEstimatedTime();
        double distance = navigationStrategy.getDistance();

        System.out.println("\nRoute Summary:");
        System.out.printf("Total distance: %.1f km\n", distance);
        System.out.printf("Estimated time: %d minutes\n", time);
    }

    public void compareAllStrategies() {
        NavigationStrategy[] strategies = {
                new CarNavigationStrategy(),
                new WalkingNavigationStrategy(),
                new PublicTransportStrategy(),
                new BicycleNavigationStrategy()
        };

        System.out.println("\n=== Route Comparison ===");
        for (NavigationStrategy strategy : strategies) {
            strategy.calculateRoute(startPoint, endPoint);
            System.out.printf("Mode: %-15s Time: %3d mins  Distance: %.1f km\n",
                    strategy.getClass().getSimpleName().replace("NavigationStrategy", ""),
                    strategy.getEstimatedTime(),
                    strategy.getDistance());
        }
    }
}
