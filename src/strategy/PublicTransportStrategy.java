package strategy;

class PublicTransportStrategy implements NavigationStrategy {
    @Override
    public void calculateRoute(String startPoint, String endPoint) {
        System.out.println("\nCalculating public transport route from " + startPoint + " to " + endPoint);
        System.out.println("→ Checking bus and train schedules");
        System.out.println("→ Including walking time to stations");
        System.out.println("→ Optimizing for fewer transfers");
    }

    @Override
    public int getEstimatedTime() {
        return 45; // minutes
    }

    @Override
    public double getDistance() {
        return 15.0; // kilometers
    }
}
