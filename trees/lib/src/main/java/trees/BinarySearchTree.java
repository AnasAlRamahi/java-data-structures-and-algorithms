package trees;

public class BinarySearchTree<T extends Comparable <T>> extends BinaryTree<T> {

    public void addNode(T value) {
        Node<T> newNode = new Node<T>(value);
        Node<T> current = root;

        if(current == null){
            root = newNode;
            return;
        }else{
            while (current != null) {
                if (current.value.compareTo(value) == 0) {
                    System.out.println("Already exists!");
                    break;
                } else {
                    if (current.value.compareTo(value) < 0) {
                        if (current.right != null) {
                            current = current.right;
                            continue;
                        } else {
                            current.right = newNode;
                            break;
                        }
                    } else {
                        if (current.left != null) {
                            current = current.left;
                            continue;
                        } else {
                            current.left = newNode;
                            break;
                        }
                    }
                }
            }
        }
    }

    public Boolean contains(T value) {
        Node<T> current = root;

        while (current != null) {
            if (current.value.compareTo(value) == 0) {
                return true;
            } else {
                if (current.value.compareTo(value) < 0) {
                    if (current.right != null) {
                        current = current.right;
                        continue;
                    } else {
                        return false;
                    }
                } else {
                    if (current.left != null) {
                        current = current.left;
                        continue;
                    } else {
                        return false;
                    }
                }
            }
        }
        return false;
    }
}
