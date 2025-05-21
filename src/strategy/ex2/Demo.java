package strategy.ex2;

public class Demo {
    public static void main(String[] args) {
        SortContext context = new SortContext();
        int[] numbers = {5, 2, 9, 1, 5, 6};

        // Using Bubble Sort
        context.setStrategy(new BubbleSort());
        context.executeStrategy(numbers);

        // Using Quick Sort
        context.setStrategy(new QuickSort());
        context.executeStrategy(numbers);
    }
}