/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashTable;

public class Library {
    public static void main(String[] args) {
        hashTable hashTable = new hashTable(10);
//        System.out.println(hashTable.hash("Cat"));
//
//        hashTable.add("Cat", 123);
//        hashTable.add("taC", 999);
//        System.out.println(hashTable.get("Cat"));
//        hashTable.contains("Cat");
//        System.out.println(hashTable.hashArray[6].getFirst());
//        System.out.println(hashTable.hashArray.length);
//        System.out.println(hashTable.hashArray[6].getValue());

//        String input1 = "Once upon a time, there was a brave princess who...";
//        String input2 = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, " +
//                "it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all " +
//                "going direct to Heaven, we were all going direct the other way – in short, " +
//                "the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
//        String input3 = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
//
//        System.out.println(hashTable.repeatedWord(input1));
//        System.out.println(hashTable.repeatedWord(input2));
//        System.out.println(hashTable.repeatedWord(input3));

        BinaryTree bst1 = new BinaryTree();
        bst1.root = new TreeNode(150);
        bst1.root.left = new TreeNode(100);
        bst1.root.left.left = new TreeNode(75);
        bst1.root.left.right = new TreeNode(160);
        bst1.root.left.right.left = new TreeNode(125);
        bst1.root.left.right.right = new TreeNode(175);
        bst1.root.right = new TreeNode(250);
        bst1.root.right.left = new TreeNode(200);
        bst1.root.right.right = new TreeNode(350);
        bst1.root.right.right.left = new TreeNode(300);
        bst1.root.right.right.right = new TreeNode(500);

        BinaryTree bst2 = new BinaryTree();
        bst2.root = new TreeNode(42);
        bst2.root.left = new TreeNode(100);
        bst2.root.left.left = new TreeNode(15);
        bst2.root.left.right = new TreeNode(160);
        bst2.root.left.right.left = new TreeNode(125);
        bst2.root.left.right.right = new TreeNode(175);
        bst2.root.right = new TreeNode(600);
        bst2.root.right.left = new TreeNode(200);
        bst2.root.right.right = new TreeNode(350);
        bst2.root.right.right.left = new TreeNode(4);
        bst2.root.right.right.right = new TreeNode(500);


        hashTable newHashTable = new hashTable(50);
        System.out.println(newHashTable.treeIntersection(bst1, bst2));

    }
}
