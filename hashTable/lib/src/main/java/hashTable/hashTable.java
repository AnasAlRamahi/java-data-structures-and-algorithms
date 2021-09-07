package hashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

public class hashTable<T>{
    private long size;
    Node[] hashArray;


    public hashTable(int size) {
        this.size = size;
        hashArray = new Node[size];
    }

    public long hash(String key) {
        long count = 0;
        for (int i = 0; i < key.length(); i++) {
            count += (long)key.charAt(i);
        }
        count = (count * 599) % this.size;
        return count;
    }

    public void add(String key ,T value) {
       Node newNode = new Node(key, value);
       long hashedKey = hash(key);
       if(hashArray[(int) hashedKey] == null){
           hashArray[(int) hashedKey] = newNode;
       }else{
           newNode.next = hashArray[(int) hashedKey];
           hashArray[(int) hashedKey] = newNode;
       }
    }

    public T get(String key){
        long hashedKey = hash(key);
        if(hashArray[(int) hashedKey] == null){
            return null;
        }else{
            Node counter;
            counter = hashArray[(int)hashedKey];
            while(counter != null)
                if(counter.getKey().equals(key)){
                    return (T)counter.getValue();
                }else{
                    counter = counter.next;
                }
        }
        return null;
    }

    public boolean contains(String key){
        long hashedKey = hash(key);
        if(hashArray[(int) hashedKey] == null){
            return false;
        }else{
            Node counter;
            counter = hashArray[(int) hashedKey];
            while(counter != null)
                if(counter.getKey().equals(key))
                    return true;
                else{
                    counter = counter.next;
                }
        }
        return false;
    }

    public static String repeatedWord(String input){
        String[] splitString = input.toLowerCase().split("[, ?.@]+", -1);
        hashTable stringHashTable = new hashTable(50);
        for(int i = 0 ; i < splitString.length ; i++){
            if(stringHashTable.get(splitString[i]) != null){
                return splitString[i];
            }
            stringHashTable.add(splitString[i], splitString[i]);
        }
        System.out.println(Arrays.toString(splitString));
        return null;
    }

    public List<Integer> treeIntersection(BinaryTree firstTree, BinaryTree secondTree){
        hashTable newHashTable = new hashTable(50);
        List<Integer> duplicateList = new ArrayList<>();
        addTreeToHash(firstTree.root, newHashTable);
        getTreeToHash(secondTree.root, duplicateList, newHashTable);
        return duplicateList;
    }

    public void addTreeToHash(TreeNode<T> visitedNode, hashTable newHashTable){
        newHashTable.add(visitedNode.value.toString(), visitedNode.value);
        if(visitedNode.left != null){
            addTreeToHash(visitedNode.left, newHashTable);
        }
        if(visitedNode.right != null){
            addTreeToHash(visitedNode.right, newHashTable);
        }
    }

    public void getTreeToHash(TreeNode<T> visitedNode, List<Integer> duplicateList, hashTable newHashTable){
        if(newHashTable.contains(visitedNode.value.toString())){
            duplicateList.add((int)visitedNode.value);
        }else{
            newHashTable.add(visitedNode.value.toString(), visitedNode.value);
        }

        if(visitedNode.left != null){
            getTreeToHash(visitedNode.left, duplicateList, newHashTable);
        }
        if(visitedNode.right != null){
            getTreeToHash(visitedNode.right, duplicateList, newHashTable);
        }
    }

}
