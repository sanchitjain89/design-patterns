package iterator;

import java.util.ArrayList;
import java.util.List;

// Example with a more complex collection - Tree structure
class TreeNode<T> {
    T data;
    List<TreeNode<T>> children;

    public TreeNode(T data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    public void addChild(TreeNode<T> child) {
        children.add(child);
    }
}
