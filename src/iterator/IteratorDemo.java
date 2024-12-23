package iterator;

// Client code
public class IteratorDemo {
    public static void main(String[] args) {
        // Example with BookCollection
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(new Book("Design Patterns", "Gang of Four"));
        bookCollection.addBook(new Book("Clean Code", "Robert Martin"));
        bookCollection.addBook(new Book("Refactoring", "Martin Fowler"));

        Iterator<Book> bookIterator = bookCollection.getIterator();
        System.out.println("Books in collection:");
        while (bookIterator.hasNext()) {
            System.out.println(bookIterator.next());
        }

        // Example with Tree
        Tree<String> familyTree = new Tree<>("Grandparent");
        TreeNode<String> parent1 = new TreeNode<>("Parent 1");
        TreeNode<String> parent2 = new TreeNode<>("Parent 2");
        TreeNode<String> child1 = new TreeNode<>("Child 1");
        TreeNode<String> child2 = new TreeNode<>("Child 2");
        TreeNode<String> child3 = new TreeNode<>("Child 3");

        parent1.addChild(child1);
        parent1.addChild(child2);
        parent2.addChild(child3);
//        familyTree.root.addChild(parent1);
//        familyTree.root.addChild(parent2);

        System.out.println("\nDepth-first traversal:");
        Iterator<String> depthFirstIterator = familyTree.getIterator();
        while (depthFirstIterator.hasNext()) {
            System.out.println(depthFirstIterator.next());
        }

        System.out.println("\nBreadth-first traversal:");
        Iterator<String> breadthFirstIterator = familyTree.getBreadthFirstIterator();
        while (breadthFirstIterator.hasNext()) {
            System.out.println(breadthFirstIterator.next());
        }
    }
}
