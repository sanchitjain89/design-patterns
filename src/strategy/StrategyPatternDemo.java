package strategy;

// Client code
public class StrategyPatternDemo {
    public static void main(String[] args) {
        NavigationSystem navSystem = new NavigationSystem();
        navSystem.setRoute("Central Park", "Times Square");

        // Using car navigation
        System.out.println("=== Car Navigation ===");
        navSystem.setNavigationStrategy(new CarNavigationStrategy());
        navSystem.navigate();

        // Switching to walking navigation
        System.out.println("\n=== Walking Navigation ===");
        navSystem.setNavigationStrategy(new WalkingNavigationStrategy());
        navSystem.navigate();

        // Switching to public transport
        System.out.println("\n=== Public Transport Navigation ===");
        navSystem.setNavigationStrategy(new PublicTransportStrategy());
        navSystem.navigate();

        // Compare all available strategies
        navSystem.compareAllStrategies();
    }
}