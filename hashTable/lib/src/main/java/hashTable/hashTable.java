package hashTable;

import java.util.LinkedList;

public class hashTable<T>{
    private int size;
    LinkedList<Node>[] hashArray;


    public hashTable(int size) {
        this.size = size;
        hashArray = new LinkedList[size];
    }

    public int hash(String key) {
        int count = 1;
        for (int i = 0; i < key.length(); i++) {
            count *= (int)key.charAt(i);
        }
        count = (count * 599) % this.size;
        return count;
    }

    public void add(String key ,T value) {
        int hashedKey = hash(key);
        Node newNode = new Node(value);
        if(hashArray[hashedKey] == null){
            hashArray[hashedKey].add(newNode);
        }
    }

    public T get(String key){
        int hashedKey = hash(key);
        return (T)hashArray[hashedKey].getFirst().getValue();
    }

    public boolean contains(String key){
        int hashedKey = hash(key);
        return hashArray[hashedKey].size() > 0;
    }
}
