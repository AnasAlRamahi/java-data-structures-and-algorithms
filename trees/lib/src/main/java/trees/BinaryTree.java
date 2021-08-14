package trees;

public class BinaryTree<T> {
    Node<T> root;
    String resultPreOrder = "";
    String resultInOrder = "";
    String resultPostOrder = "";

    public String preOrder(Node<T> visitedNode){
        resultInOrder += visitedNode.value + " -> ";
        if(visitedNode.left != null){
            preOrder(visitedNode.left);
        }
        if(visitedNode.right != null){
            preOrder(visitedNode.right);
        }
        return resultInOrder;
    }

    public String inOrder(Node<T> visitedNode){
        if(visitedNode.left != null){
            inOrder(visitedNode.left);
        }
        resultInOrder += visitedNode.value + " -> ";
        if(visitedNode.right != null){
            inOrder(visitedNode.right);
        }
        return resultInOrder;
    }

    public String postOrder(Node<T> visitedNode){
        if(visitedNode.left != null){
            postOrder(visitedNode.left);
        }
        if(visitedNode.right != null){
            postOrder(visitedNode.right);
        }
        resultPostOrder += visitedNode.value + " -> ";
        return resultPostOrder;
    }

}
