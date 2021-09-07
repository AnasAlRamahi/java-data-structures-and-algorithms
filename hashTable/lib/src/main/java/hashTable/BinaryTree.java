package hashTable;


import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T> {
    TreeNode<T> root;
    String resultPreOrder = "";
    String resultInOrder = "";
    String resultPostOrder = "";
    private int max = 0;

    public String preOrder(TreeNode<T> visitedNode){
        resultInOrder += visitedNode.value + " -> ";
        if(visitedNode.left != null){
            preOrder(visitedNode.left);
        }
        if(visitedNode.right != null){
            preOrder(visitedNode.right);
        }
        return resultInOrder;
    }

    public String inOrder(TreeNode<T> visitedNode){
        if(visitedNode.left != null){
            inOrder(visitedNode.left);
        }
        resultInOrder += visitedNode.value + " -> ";
        if(visitedNode.right != null){
            inOrder(visitedNode.right);
        }
        return resultInOrder;
    }

    public String postOrder(TreeNode<T> visitedNode){
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

    public void maxInTree(TreeNode<T> visitedNode){

        if(visitedNode.left != null){
            maxInTree(visitedNode.left);
        }
        if ((int)visitedNode.value > max){
            max = (int)visitedNode.value;
        }
        if(visitedNode.right != null){
            maxInTree(visitedNode.right);
        }

    }

//    public List<T> treeBreadthFirst(BinaryTree<T> tree){
//        if(tree.root == null){
//            return null;
//        }
//        List<T> resultList = new ArrayList<T>();
//        Queue<T> q = new Queue<T>();
//
//        q.enqueue(tree.root);
//
//        while(!q.isEmpty()){
//            if(q.front.left != null){
//                q.enqueue(q.front.left);
//            }
//            if(q.front.right != null){
//                q.enqueue(q.front.right);
//            }
//            resultList.add(q.dequeue());
//
//        }
//        return resultList;
//    }

}
