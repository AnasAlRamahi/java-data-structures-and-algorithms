package trees;

import java.util.EmptyStackException;

public class BinaryTree<T> {
    Node<T> root;
    String resultPreOrder = "";
    String resultInOrder = "";
    String resultPostOrder = "";
    private int max = 0;

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

    public int maxInTree(){
        if(this.root == null){
            throw new NullPointerException();
        }
        max = 0;
        maxInTree(this.root);
        return max;
    }

    public void maxInTree(Node<T> visitedNode){

        if(visitedNode.left != null){
            maxInTree(visitedNode.left);
        }
        if ((int)visitedNode.value > max){
            max = (int)visitedNode.value;
        }
        if(visitedNode.right != null){
            maxInTree(visitedNode.right);
        }


//        if(visitedNode.left != null){
//            System.out.println("visit left");
//            maxInTree(visitedNode.left);
//        }
//
//        if(visitedNode.right != null){
//            System.out.println("visit right");
//            maxInTree(visitedNode.right);
//        }

//        if(visitedNode.left != null && visitedNode.right != null){
//            System.out.println("comparing");
//            if(maxInTree(visitedNode.left) > maxInTree(visitedNode.right)){
//                return (int)visitedNode.left.value;
//            }else{
//                return (int)visitedNode.right.value;
//            }
//        }
//        if(visitedNode.left == null && visitedNode.right != null){
//            return (int)visitedNode.right.value;
//        }else if(visitedNode.left != null && visitedNode.right == null){
//            return (int)visitedNode.left.value;
//        }
//        else if (visitedNode.left == null && visitedNode.right == null){
//            return (int)visitedNode.value;
//        }
//        else{
//            System.out.println("hahaha");
//            return 0;
//        }
    }

}
