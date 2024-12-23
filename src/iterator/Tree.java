package iterator;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Tree collection with different traversal iterators
class Tree<T> implements Container<T> {
    private TreeNode<T> root;

    public Tree(T rootData) {
        root = new TreeNode<>(rootData);
    }

    // Default iterator (depth-first)
    @Override
    public Iterator<T> getIterator() {
        return new DepthFirstIterator();
    }

    // Additional method for breadth-first iteration
    public Iterator<T> getBreadthFirstIterator() {
        return new BreadthFirstIterator();
    }

    // Depth-first iterator
    private class DepthFirstIterator implements Iterator<T> {
        private Stack<TreeNode<T>> stack;

        public DepthFirstIterator() {
            stack = new Stack<>();
            if (root != null) {
                stack.push(root);
            }
        }

        @Override
        public boolean hasNext() {
            return !stack.isEmpty();
        }

        @Override
        public T next() {
            if (!hasNext()) {
                return null;
            }

            TreeNode<T> node = stack.pop();
            // Add children in reverse order for correct traversal
            for (int i = node.children.size() - 1; i >= 0; i--) {
                stack.push(node.children.get(i));
            }

            return node.data;
        }

        @Override
        public void reset() {
            stack.clear();
            if (root != null) {
                stack.push(root);
            }
        }
    }

    // Breadth-first iterator
    private class BreadthFirstIterator implements Iterator<T> {
        private Queue<TreeNode<T>> queue;

        public BreadthFirstIterator() {
            queue = new LinkedList<>();
            if (root != null) {
                queue.offer(root);
            }
        }

        @Override
        public boolean hasNext() {
            return !queue.isEmpty();
        }

        @Override
        public T next() {
            if (!hasNext()) {
                return null;
            }

            TreeNode<T> node = queue.poll();
            for (TreeNode<T> child : node.children) {
                queue.offer(child);
            }

            return node.data;
        }

        @Override
        public void reset() {
            queue.clear();
            if (root != null) {
                queue.offer(root);
            }
        }
    }
}
