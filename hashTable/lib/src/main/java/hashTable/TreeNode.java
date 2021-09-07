package hashTable;

import java.util.List;

public class TreeNode<T> {
    T value;
    TreeNode<T> left;
    TreeNode<T> right;
    TreeNode<T> next;
    List<TreeNode> children;

    public TreeNode(T value) {
        this.value = value;
    }
}
