package strategy.ex2;

// Context Class
class SortContext {
    private SortingStrategy strategy;

    // Allows setting the strategy dynamically
    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    // Executes sorting using the selected strategy
    public void executeStrategy(int[] numbers) {
        if (strategy == null) {
            System.out.println("No sorting strategy selected.");
            return;
        }
        strategy.sort(numbers);
    }
}

