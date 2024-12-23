package composite;

// Client Code
public class CompositePatternDemo {
    public static void main(String[] args) {
        // Create files
        File file1 = new File("document.txt", 100);
        File file2 = new File("image.jpg", 500);

        // Create directories
        Directory mainDirectory = new Directory("Main");
        Directory subDirectory = new Directory("Subdirectory");

        // Add files to subdirectory
        subDirectory.addComponent(file1);
        subDirectory.addComponent(file2);

        // Add subdirectory to main directory
        mainDirectory.addComponent(subDirectory);

        // Display and calculate size
        mainDirectory.display();
        System.out.println("Total Size: " + mainDirectory.getSize() + " bytes");
    }
}
