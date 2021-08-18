package trees;

import org.checkerframework.checker.units.qual.K;

import java.util.List;

public class KaryTree {
    KNode root;
    final int k;

    KaryTree(int k){
        this.k = k;
    }



    public KaryTree fizzBuzz(KaryTree kTree){
        int iterations = kTree.k;
        KaryTree newTree = new KaryTree(iterations);
        newTree.root = kTree.root;
        fizzBuzzRecursion(newTree.root, iterations);
        return newTree;
    }

    public void fizzBuzzRecursion(KNode root, int k){


        if (Integer.parseInt(root.value) % 3 == 0 && Integer.parseInt(root.value) % 5 == 0 ){
            root.value = "FizzBuzz";
        }
        else if (Integer.parseInt(root.value) % 3 == 0 ){
            root.value = "Fizz";
        }
        else if (Integer.parseInt(root.value) % 5 == 0 ){
            root.value = "Buzz";
        }
        System.out.println(root.value);

        if(root.children.isEmpty()){
            return;
        }
        for(KNode child : root.children){
                fizzBuzzRecursion(child, k);
        }
    }
}
